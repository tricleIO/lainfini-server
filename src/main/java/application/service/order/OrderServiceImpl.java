package application.service.order;

import application.configuration.AppProperties;
import application.persistence.entity.*;
import application.persistence.repository.*;
import application.persistence.type.CartStatusEnum;
import application.persistence.type.OrderStatusEnum;
import application.persistence.type.PaymentMethodEnum;
import application.persistence.type.PaymentStateEnum;
import application.rest.domain.*;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.address.AddressService;
import application.service.cart.CartService;
import application.service.delivery.DeliveryService;
import application.service.mail.MailService;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.shippingRegion.ShippingRegionService;
import application.service.shippingTariff.ShippingTariffService;
import application.service.stockItem.StockItemService;
import application.service.user.UserService;
import application.util.HtmlGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.context.Context;

import java.math.BigDecimal;
import java.util.*;

@Service
public class OrderServiceImpl extends BaseDatabaseServiceImpl<CustomerOrder, UUID, OrderRepository, OrderDTO> implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private CartService cartService;

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private ShippingRegionService shippingRegionService;

    @Autowired
    private ShippingTariffService shippingTariffService;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private MailService mailService;

    @Autowired
    private ProductService productService;

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private HtmlGenerator htmlGenerator;

    @Autowired
    private StockItemService stockItemService;

    @Override
    @Transactional
    public synchronized ServiceResponse<OrderDTO> create(OrderDTO dto) {
        // cart is given?
        if (dto.getCartUid() == null) {
            return ServiceResponse.error(ServiceResponseStatus.CART_NOT_GIVEN);
        }
        // cart exists?
        if (!cartRepository.exists(dto.getCartUid())) {
            return ServiceResponse.error(ServiceResponseStatus.CART_NOT_FOUND);
        }
        List<CartItem> cartItems = cartItemRepository.findByCartId(dto.getCartUid());
        // enough in stock?
        ServiceResponse<Boolean> countItemsInStockResponse = enoughAllOfCartItemsInStock(cartItems);
        if (!countItemsInStockResponse.isSuccessful()) {
            return ServiceResponse.error(countItemsInStockResponse.getStatus());
        }
        // create order
        ServiceResponse<OrderDTO> createResponse = super.create(dto);
        if (createResponse.isSuccessful()) {
            // send emails
            ServiceResponse<OrderDTO> readOrderResponse = read(createResponse.getBody().getUid());
            if (readOrderResponse.isSuccessful()) {
                // reserve all items
                reserveItems(readOrderResponse.getBody());
                // send mails in own thread
                new Thread(() -> sendMails(dto, readOrderResponse)).start();
            }
            return readOrderResponse;
        }
        return createResponse;
    }

    private void sendMails(OrderDTO dto, ServiceResponse<OrderDTO> readOrderResponse) {
        // set variables
        final Context context = new Context(Locale.ENGLISH);
        context.setVariable("customer", dto.getCustomer());
        context.setVariable("deliveryAddress", dto.getDeliveryAddress());
        context.setVariable("order", readOrderResponse.getBody());
        context.setVariable("shippingTariff", dto.getShippingTariff());
        sendEmailToCustomer(dto.getCustomer().getEmail(), context);
        sendEmailToSellers(context);
    }

    private void sendEmailToSellers(Context context) {
        try {
            String htmlForSellers = htmlGenerator.generateHtml("templates/emails/order/order_seller.html", context);
            for (String sellerEmail : appProperties.getSellerEmails()) {
                mailService.sendMail(
                        createMail(
                                sellerEmail,
                                "Check new Order in e-shop",
                                htmlForSellers
                        )
                );
            }
        } catch (Exception ex) {
        }
    }

    private void sendEmailToCustomer(String emailAddress, Context context) {
        try {
            mailService.sendMail(
                    createMail(
                            emailAddress,
                            "Order confirmation",
                            htmlGenerator.generateHtml("templates/emails/order/order_customer.html", context)
                    )
            );
        } catch (Exception ex) {
        }
    }

    private ServiceResponse<Boolean> enoughAllOfCartItemsInStock(List<CartItem> cartItems) {
        for (CartItem item : cartItems) {
            ServiceResponse<Long> countItemsInStockResponse = stockItemService.countProductsInStock(item.getProduct().getId());
            if (!countItemsInStockResponse.isSuccessful()) {
                return ServiceResponse.error(countItemsInStockResponse.getStatus());
            }
            if (countItemsInStockResponse.getBody() < item.getQuantity()) {
                return ServiceResponse.error(ServiceResponseStatus.NOT_ENOUGH_ITEMS_IN_STOCK);
            }
        }
        return ServiceResponse.success(true);
    }

    private void reserveItems(OrderDTO orderDTO) {
        for (OrderItemDTO item : orderDTO.getItems()) {
            ServiceResponse<Page<StockItemDTO>> reserveItemsResponse = stockItemService.reserveProduct(
                    item.getProductUid(),
                    item.getQuantity(),
                    orderDTO.getUid()
            );
            if (!reserveItemsResponse.isSuccessful()) {
                throw new RuntimeException("Incomplete order!");
            }
        }
    }

    @Override
    public ServiceResponse<Page<OrderDTO>> readCustomerOrders(UUID customerId, Pageable pageable) {
        Page<CustomerOrder> orders = getRepository().findByCustomerId(customerId, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(orders, pageable)
        );
    }

    @Override
    public ServiceResponse<OrderDTO> shipOrder(UUID orderId) {
        ServiceResponse<OrderDTO> readResponse = read(orderId);
        if (!readResponse.isSuccessful()) {
            return readResponse;
        }
        if (readResponse.getBody().getStatus() == OrderStatusEnum.SHIPPED) {
            return ServiceResponse.error(ServiceResponseStatus.ORDER_ALREADY_SHIPPED);
        }
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUid(orderId);
        orderDTO.setStatus(OrderStatusEnum.SHIPPED);
        ServiceResponse<OrderDTO> patchResponse = patch(orderDTO);
        if (!patchResponse.isSuccessful()) {
            return patchResponse;
        }
        ServiceResponse<UserDTO> userResponse = userService.read(readResponse.getBody().getCustomerUid());
        if (userResponse.isSuccessful()) {
            new Thread(() -> sendShippedOrderMail(orderDTO, userResponse.getBody().getEmail())).start();
        }
        return read(orderId);
    }

    private void sendShippedOrderMail(OrderDTO orderDTO, String emailAddress) {
        try {
            final Context context = new Context(Locale.ENGLISH);
            context.setVariable("order", orderDTO);
            // email for customer
            mailService.sendMail(
                    createMail(
                            emailAddress,
                            "Order shipped",
                            htmlGenerator.generateHtml("templates/emails/order/order_shipped.html", context)
                    )
            );
        } catch (Exception ex) {
        }
    }

    private MailDTO createMail(String email, String subject, String text) {
        MailDTO mailDTO = new MailDTO();
        mailDTO.setTo(email);
        mailDTO.setSubject(subject);
        mailDTO.setText(text);
        return mailDTO;
    }

    @Override
    protected ServiceResponse<OrderDTO> doBeforeConvertInCreate(OrderDTO dto) {
        // defaults
        dto.setCreatedAt(new Date());
        if (dto.getStatus() == null) {
            dto.setStatus(OrderStatusEnum.WAITING_FOR_PAYMENT);
        }
        // restrictions
        if (dto.getPaymentMethod().getState() == PaymentMethodEnum.State.DENIED) {
            return ServiceResponse.error(ServiceResponseStatus.PAYMENT_METHOD_FORBIDDEN);
        }
        // cart
        if (dto.getCartUid() == null) {
            return ServiceResponse.error(ServiceResponseStatus.CART_NOT_GIVEN);
        }
        ServiceResponse<CartDTO> cartResponse = cartService.read(dto.getCartUid());
        if (!cartResponse.isSuccessful()) {
            return ServiceResponse.error(ServiceResponseStatus.CART_NOT_FOUND);
        }
        CartDTO cartDTO = cartResponse.getBody();
        if (cartDTO.getStatus() != CartStatusEnum.OPENED) {
            return ServiceResponse.error(ServiceResponseStatus.CART_NOT_OPEN);
        }
        dto.setCart(cartDTO);
        ServiceResponse<UserDTO> userResponse = null;
        if (dto.getCustomerUid() == null) {
            if (dto.getCustomer() != null) {
                // create unregistered user
                userResponse = userService.create(dto.getCustomer());
                if (!userResponse.isSuccessful()) {
                    return ServiceResponse.error(userResponse.getStatus());
                }
                dto.setCustomer(userResponse.getBody());
            } else {
                return ServiceResponse.error(ServiceResponseStatus.CUSTOMER_NOT_GIVEN);
            }
        } else {
            userResponse = userService.read(dto.getCustomerUid());
            if (!userResponse.isSuccessful()) {
                return ServiceResponse.error(userResponse.getStatus());
            }
        }
        // addresses
        if (dto.getDeliveryAddressUid() == null) {
            if (dto.getDeliveryAddress() != null) {
                dto.getDeliveryAddress().setCustomer(userResponse.getBody());
                // create his delivery address
                ServiceResponse<AddressDTO> deliveryAddressResponse = addressService.create(
                        dto.getDeliveryAddress()
                );
                if (!deliveryAddressResponse.isSuccessful()) {
                    return ServiceResponse.error(deliveryAddressResponse.getStatus());
                }
                dto.setDeliveryAddress(deliveryAddressResponse.getBody());

                // if billing address is set, create it to
                if (dto.getBillingAddress() != null) {
                    dto.getBillingAddress().setCustomer(userResponse.getBody());
                    ServiceResponse<AddressDTO> billingAddressResponse = addressService.create(
                            dto.getBillingAddress()
                    );
                    if (!billingAddressResponse.isSuccessful()) {
                        return ServiceResponse.error(billingAddressResponse.getStatus());
                    }
                    dto.setBillingAddress(billingAddressResponse.getBody());
                }
            } else {
                return ServiceResponse.error(ServiceResponseStatus.DELIVERY_ADDRESS_NOT_GIVEN);
            }
        }
        // tariff
        ServiceResponse<ShippingTariffDTO> tariffResponse = shippingTariffService.read(dto.getShippingTariffUid());
        if (tariffResponse.isSuccessful()) {
            ShippingDTO shippingDTO = new ShippingDTO();
            ShippingTariffDTO tariff = tariffResponse.getBody();
            shippingDTO.setShippingTariff(tariff);
            // @TODO - NOT DONE
            shippingDTO.setTrackingNumber("AAEE_NOT_DONE");
            shippingDTO.setPrice(tariff.getPrice());
            shippingDTO.setCurrencyUid(tariff.getCurrency().getUid());
            ServiceResponse<ShippingDTO> shippingCreateResponse = deliveryService.create(shippingDTO);
            if (!shippingCreateResponse.isSuccessful()) {
                return ServiceResponse.error(shippingCreateResponse.getStatus());
            }
            dto.setShipping(shippingCreateResponse.getBody());
        }
        return super.doBeforeConvertInCreate(dto);
    }

    @Override
    protected void doAfterCreate(CustomerOrder entity) {
        if (entity.getCart() != null) {
            Cart cart = cartRepository.findOne(entity.getCart().getId());
            if (cart != null) {
                for (CartItem cartItem : cartItemRepository.findByCartId(entity.getCart().getId())) {
                    // create order item from cart item
                    OrderItem orderItem = new OrderItem();
                    orderItem.setProduct(cartItem.getProduct());
                    orderItem.setQuantity(cartItem.getQuantity());
                    orderItem.setPrice(cartItem.getProduct().getPrice());
                    orderItem.setAddedAt(cartItem.getAddedAt());
                    orderItem.setOrder(entity);
                    orderItemRepository.save(orderItem);
                }
            }
            cart.setStatus(CartStatusEnum.CHECKEDOUT);
            cartRepository.save(cart);
        }
    }

    @Override
    protected AdditionalDataManipulatorBatch<OrderDTO> getAdditionalDataLoaderBatch(OrderDTO orderDTO) {
        AdditionalDataManipulatorBatch<OrderDTO> batch = new AdditionalDataManipulatorBatch<>(orderDTO);
        // add customer
        batch.add(o -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(o.getCustomerUid(), userService::read),
                new AdditionalDataManipulator.Writer<>(o::setCustomer),
                ServiceResponseStatus.CUSTOMER_NOT_FOUND)
        );
        // add cart
        batch.add(o -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(o.getCartUid(), cartService::read),
                new AdditionalDataManipulator.Writer<>(o::setCart),
                ServiceResponseStatus.CART_NOT_FOUND)
        );
        // add shipping tariff
        batch.add(o -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(o.getShippingTariffUid(), shippingTariffService::read),
                new AdditionalDataManipulator.Writer<>(o::setShippingTariff),
                ServiceResponseStatus.DELIVERY_NOT_FOUND)
        );
        // add billing address
        batch.add(o -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(o.getBillingAddressUid(), addressService::read),
                new AdditionalDataManipulator.Writer<>(o::setBillingAddress),
                ServiceResponseStatus.ADDRESS_NOT_FOUND)
        );
        // add delivery address
        batch.add(o -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(o.getDeliveryAddressUid(), addressService::read),
                new AdditionalDataManipulator.Writer<>(o::setDeliveryAddress),
                ServiceResponseStatus.ADDRESS_NOT_FOUND)
        );
        // add shipping region
        batch.add(o -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(o.getShippingRegionUid(), shippingRegionService::read),
                new AdditionalDataManipulator.Writer<>(o::setShippingRegion),
                ServiceResponseStatus.SHIPPING_REGION_NOT_FOUND)
        );
        return batch;
    }

    @Override
    protected void additionalUpdateDto(OrderDTO dto) {
        List<OrderItem> items = orderItemRepository.findByOrderId(dto.getUid());
        Set<OrderItemDTO> itemDTOs = new HashSet<>();
        for (OrderItem item : items) {
            OrderItemDTO orderItemDTO = item.toDTO(false);
            ServiceResponse<ProductDTO> productResponse = productService.read(item.getProduct().getId());
            if (productResponse.isSuccessful()) {
                orderItemDTO.setProduct(productResponse.getBody());
            }
            itemDTOs.add(orderItemDTO);
        }
        dto.setItems(itemDTOs);
        dto.setPaymentState(getOrderState(dto));
    }

    private PaymentStateEnum getOrderState(OrderDTO orderDTO) {
        // total order price
        BigDecimal totalPriceWithShipping = orderDTO.getTotalPriceWithShipping();
        // total paid amount from order payments
        List<Payment> orderPayments = paymentRepository.findByOrderId(orderDTO.getUid());
        BigDecimal totalPaidAmount = BigDecimal.ZERO;
        for (Payment payment : orderPayments) {
            totalPaidAmount = totalPaidAmount.add(payment.getAmount());
        }

        // get state
        if (totalPaidAmount.compareTo(totalPriceWithShipping) == 0) {
            return PaymentStateEnum.PAID;
        } else if (totalPaidAmount.compareTo(totalPriceWithShipping) == 1) {
            return PaymentStateEnum.OVERPAID;
        } else if (totalPaidAmount.compareTo(BigDecimal.ZERO) == 0) {
            return PaymentStateEnum.NOT_PAID;
        } else {
            return PaymentStateEnum.PARTLY_PAID;
        }
    }

    @Override
    public OrderRepository getRepository() {
        return orderRepository;
    }

}

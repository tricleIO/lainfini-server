package application.service.order;

import application.persistence.entity.Cart;
import application.persistence.entity.CartItem;
import application.persistence.entity.CustomerOrder;
import application.persistence.entity.OrderItem;
import application.persistence.repository.CartItemRepository;
import application.persistence.repository.CartRepository;
import application.persistence.repository.OrderItemRepository;
import application.persistence.repository.OrderRepository;
import application.persistence.type.CartStatusEnum;
import application.rest.domain.*;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.address.AddressService;
import application.service.cart.CartService;
import application.service.delivery.DeliveryService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.shippingRegion.ShippingRegionService;
import application.service.shippingTariff.ShippingTariffService;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

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

    @Override
    public ServiceResponse<OrderDTO> create(OrderDTO dto) {
        ServiceResponse<OrderDTO> createResponse = super.create(dto);
        if (createResponse.isSuccessful()) {
            return read(createResponse.getBody().getUid());
        }
        return createResponse;
    }

    @Override
    public ServiceResponse<Page<OrderDTO>> readCustomerOrders(UUID customerId, Pageable pageable) {
        Page<CustomerOrder> orders = getRepository().findByCustomerId(customerId, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(orders, pageable)
        );
    }

    @Override
    protected ServiceResponse<OrderDTO> doBeforeConvertInCreate(OrderDTO dto) {
        if (dto.getCustomerUid() == null && dto.getDeliveryAddressUid() == null) {
            if (dto.getCustomer() != null && dto.getDeliveryAddress() != null) {
                // create unregistered user
                ServiceResponse<UserDTO> userResponse = userService.create(dto.getCustomer());
                if (!userResponse.isSuccessful()) {
                    return ServiceResponse.error(userResponse.getStatus());
                }
                dto.setCustomer(userResponse.getBody());

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
                    ServiceResponse<AddressDTO> billingAddressResponse = addressService.create(
                            dto.getBillingAddress()
                    );
                    if (!billingAddressResponse.isSuccessful()) {
                        return ServiceResponse.error(billingAddressResponse.getStatus());
                    }
                    dto.setBillingAddress(billingAddressResponse.getBody());
                }
            } else {
                return ServiceResponse.error(ServiceResponseStatus.CUSTOMER_OR_DELIVERY_ADDRESS_NOT_GIVEN);
            }
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
            itemDTOs.add(item.toDTO(false));
        }
        dto.setItems(itemDTOs);
    }

    @Override
    public OrderRepository getRepository() {
        return orderRepository;
    }

}

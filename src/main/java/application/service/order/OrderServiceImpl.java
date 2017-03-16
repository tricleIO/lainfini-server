package application.service.order;

import application.persistence.entity.CartItem;
import application.persistence.entity.CustomerOrder;
import application.persistence.entity.OrderItem;
import application.persistence.repository.OrderRepository;
import application.rest.domain.AddressDTO;
import application.rest.domain.OrderDTO;
import application.rest.domain.UserDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.address.AddressService;
import application.service.cart.CartService;
import application.service.delivery.DeliveryService;
import application.service.paymentMethod.PaymentMethodService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class OrderServiceImpl extends BaseDatabaseServiceImpl<CustomerOrder, UUID, OrderRepository, OrderDTO> implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private CartService cartService;

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    private PaymentMethodService paymentMethodService;

    @Autowired
    private AddressService addressService;

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
            if (dto.getCustomer() != null &&  dto.getDeliveryAddress() != null) {
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
        return super.doBeforeConvertInCreate(dto);
    }

    @Override
    protected void doAfterCreate(CustomerOrder entity) {
        if (entity.getCart() != null) {
            Set<CartItem> cartItems = entity.getCart().getItems();
            Set<OrderItem> orderItems = new LinkedHashSet<>();
            for (CartItem cartItem : cartItems) {
                OrderItem orderItem = new OrderItem();
                orderItem.setProduct(cartItem.getProduct());
                orderItem.setQuantity(cartItem.getQuantity());
                orderItem.setAddedAt(cartItem.getAddedAt());
                orderItem.setOrder(entity);
                orderItem.setPrice(cartItem.getProduct().getPrice());
                orderItems.add(orderItem);
            }
            entity.setItems(orderItems);
            orderRepository.save(entity);
        }
    }

    @Override
    protected AdditionalDataManipulatorBatch<OrderDTO> getCreateAdditionalDataLoaderBatch(OrderDTO orderDTO) {
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
        // add delivery type
        batch.add(o -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(o.getDeliveryTypeUid(), deliveryService::read),
                new AdditionalDataManipulator.Writer<>(o::setDeliveryType),
                ServiceResponseStatus.DELIVERY_NOT_FOUND)
        );
        // add payment method
        batch.add(o -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(o.getPaymentMethodUid(), paymentMethodService::read),
                new AdditionalDataManipulator.Writer<>(o::setPaymentMethod),
                ServiceResponseStatus.PAYMENT_METHOD_NOT_FOUND)
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
        return batch;
    }

    @Override
    public OrderRepository getRepository() {
        return orderRepository;
    }

}

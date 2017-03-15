package application.service.order;

import application.persistence.entity.CustomerOrder;
import application.persistence.repository.OrderRepository;
import application.rest.domain.OrderDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
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

    @Override
    public ServiceResponse<Page<OrderDTO>> readCustomerOrders(UUID customerId, Pageable pageable) {
        Page<CustomerOrder> orders = getRepository().findByCustomerId(customerId, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(orders, pageable)
        );
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
        return batch;
    }

    @Override
    public OrderRepository getRepository() {
        return orderRepository;
    }

}

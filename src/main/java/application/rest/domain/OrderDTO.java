package application.rest.domain;

import application.persistence.entity.Order;
import application.persistence.type.OrderStatusEnum;
import lombok.Data;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Data
public class OrderDTO implements ReadWriteDatabaseDTO<Order>, IdentifableDTO<UUID> {

    private UUID uid;
    private UUID cartUid;
    private UUID customerUid;
    private Integer deliveryTypeUid;
    private Integer paymentMethodUid;
    private Date createdAt;
    private OrderStatusEnum status;
    private Set<OrderItemDTO> items;

    private CartDTO cart;
    private UserDTO customer;
    private DeliveryDTO deliveryType;
    private PaymentMethodDTO paymentMethod;

    @Override
    public Order toEntity(boolean selectAsParent, Object... parentParams) {
        Order order = new Order();
        order.setCreatedAt(createdAt);
        order.setStatus(status);
        if (selectAsParent) {
            if (cart != null) {
                order.setCart(cart.toEntity(false));
            }
            if (customer != null) {
                order.setCustomer(customer.toEntity(false));
            }
            if (deliveryType != null) {
                order.setDeliveryType(deliveryType.toEntity(false));
            }
            if (paymentMethod != null) {
                order.setPaymentMethod(paymentMethod.toEntity(false));
            }
        }
        return order;
    }

}

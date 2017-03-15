package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.OrderStatusEnum;
import application.rest.domain.OrderDTO;
import application.rest.domain.OrderItemDTO;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "customer_order")
@Data
public class CustomerOrder implements DTOConvertable<OrderDTO>, Serializable {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @OneToOne
    @NotNull
    @JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
    private User customer;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Enumerated(EnumType.ORDINAL)
    private OrderStatusEnum status;

    @ManyToOne
    @JoinColumn(name = "delivery_id", referencedColumnName = "id")
    private Delivery deliveryType;

    @ManyToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    private Cart cart;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
    private Set<OrderItem> items;

    @Override
    public OrderDTO toDTO(boolean selectAsParent, Object... parentParams) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUid(id);
        if (customer != null) {
            orderDTO.setCustomerUid(customer.getId());
        }
        orderDTO.setCreatedAt(createdAt);
        if (cart != null) {
            orderDTO.setCartUid(cart.getId());
        }
        if (deliveryType != null) {
            orderDTO.setDeliveryType(deliveryType.toDTO(false));
        }
        if (paymentMethod != null) {
            orderDTO.setPaymentMethod(paymentMethod.toDTO(false));
        }
        if (items != null) {
            Set<OrderItemDTO> itemDTOs = new LinkedHashSet<>(items.size());
            for (OrderItem item : items) {
                itemDTOs.add(item.toDTO(false));
            }
            orderDTO.setItems(itemDTOs);
        }
        return orderDTO;
    }

}

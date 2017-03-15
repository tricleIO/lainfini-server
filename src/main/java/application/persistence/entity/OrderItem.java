package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.OrderItemDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderItem implements DTOConvertable<OrderItemDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    private Integer quantity;

    @NotNull
    @Column(name = "added_at", nullable = false)
    private Date addedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private CustomerOrder order;

    @Override
    public OrderItemDTO toDTO(boolean selectAsParent, Object... parentParams) {
        OrderItemDTO orderItemDTO = new OrderItemDTO();
        orderItemDTO.setUid(id);
        if (product != null) {
            orderItemDTO.setProductUid(product.getId());
        }
        orderItemDTO.setQuantity(quantity);
        orderItemDTO.setAddedAt(addedAt);
        return orderItemDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem that = (OrderItem) o;

        if (!product.getId().equals(that.product.getId())) return false;
        return order.getId().equals(that.order.getId());
    }

    @Override
    public int hashCode() {
        int result = product.getId().hashCode();
        result = 31 * result + order.getId().hashCode();
        return result;
    }

}

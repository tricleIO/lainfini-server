package application.rest.domain;

import application.persistence.entity.OrderItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemDTO implements ReadWriteDatabaseDTO<OrderItem>, IdentifableDTO<Long> {

    private Long uid;
    private UUID productUid;
    private Integer quantity;
    private Date addedAt;
    private UUID orderUid;
    private Double price;

    private ProductDTO product;
    private OrderDTO order;

    @Override
    public OrderItem toEntity(boolean selectAsParent, Object... parentParams) {
        OrderItem orderItem = new OrderItem();
        orderItem.setId(uid);
        if (selectAsParent) {
            if (product != null) {
                orderItem.setProduct(product.toEntity(false));
            }
            if (order != null) {
                orderItem.setOrder(order.toEntity(false));
            }
        }
        orderItem.setAddedAt(addedAt);
        orderItem.setQuantity(quantity);
        orderItem.setAddedAt(addedAt);
        orderItem.setPrice(price);
        return orderItem;
    }
}

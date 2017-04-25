package application.rest.domain;

import application.persistence.entity.OrderItem;
import application.rest.UserController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemDTO extends ResourceSupport implements ReadWriteDatabaseDTO<OrderItem>, IdentifableDTO<Long>, Linkable {

    private Long uid;
    private UUID productUid;
    private Integer quantity;
    private Date addedAt;
    private UUID orderUid;
    private BigDecimal price;

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

    @Override
    public void addLinks() {
        if (productUid != null) {
            add(linkTo(methodOn(UserController.class).readUser(productUid)).withRel("product"));
        }
    }
}

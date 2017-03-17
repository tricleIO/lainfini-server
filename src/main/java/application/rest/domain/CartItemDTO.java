package application.rest.domain;

import application.persistence.entity.CartItem;
import application.rest.CartController;
import application.rest.ProductController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartItemDTO extends ResourceSupport implements ReadWriteDatabaseDTO<CartItem>, IdentifableDTO<Long>, Linkable {

    private Long uid;
    private UUID cartUid;
    private UUID productUid;
    private Integer quantity = 1;
    private Date addedAt;

    private ProductDTO product;
    private CartDTO cart;

    @Override
    public void addLinks() {
        if (productUid != null) {
            add(linkTo(methodOn(ProductController.class).readProduct(productUid, null)).withRel("product"));
        }
        if (getCartUid() != null) {
            add(linkTo(methodOn(CartController.class).readCart(cartUid)).withRel("cart"));
        }
    }

    @Override
    public CartItem toEntity(boolean selectAsParent, Object... parentParams) {
        CartItem cartItem = new CartItem();
        cartItem.setId(uid);
        if (selectAsParent) {
            if (cart != null) {
                cartItem.setCart(cart.toEntity(false));
            }
            if (product != null) {
                cartItem.setProduct(product.toEntity(false));
            }
        }
        cartItem.setQuantity(quantity);
        cartItem.setAddedAt(new Date());
        return cartItem;
    }

}

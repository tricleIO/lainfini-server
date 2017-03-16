package application.rest.domain;

import application.persistence.entity.CartHasProduct;
import application.rest.ProductController;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
public class ItemDTO extends ResourceSupport implements ReadWriteDatabaseDTO<CartHasProduct>, Linkable {

    private UUID cartUuid;
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
    }

    @Override
    public CartHasProduct toEntity(boolean selectAsParent, Object... parentParams) {
        CartHasProduct cartHasProduct = new CartHasProduct();
        if (selectAsParent) {
            if (cart != null) {
                cartHasProduct.setCart(cart.toEntity(false));
            }
            if (product != null) {
                cartHasProduct.setProduct(product.toEntity(false));
            }
        }
        cartHasProduct.setQuantity(quantity);
        cartHasProduct.setAddedAt(new Date());
        return cartHasProduct;
    }
}

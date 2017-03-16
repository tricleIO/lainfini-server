package application.rest.domain;

import application.rest.CartController;
import application.rest.ProductController;
import lombok.Data;

import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
public class ItemResponseDTO extends ItemDTO {

    private UUID cartUid;

    public ItemResponseDTO() {
    }

    public ItemResponseDTO(UUID cartUid, ItemDTO itemDTO) {
        super();
        this.setProductUid(itemDTO.getProductUid());
        this.setQuantity(itemDTO.getQuantity());
        this.setCartUid(cartUid);
    }

    @Override
    public void addLinks() {
        if (cartUid != null) {
            add(linkTo(methodOn(CartController.class).readCart(cartUid)).withRel("cart"));
        }
        if (getProductUid() != null) {
            add(linkTo(methodOn(ProductController.class).readProduct(getProductUid(), null)).withRel("product"));
        }
    }
}

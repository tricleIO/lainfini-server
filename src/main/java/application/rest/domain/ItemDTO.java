package application.rest.domain;

import application.rest.ProductController;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
public class ItemDTO extends ResourceSupport implements Linkable {

    private UUID productUid;

    private Integer quantity;

    @Override
    public void addLinks() {
        if (productUid != null) {
            add(linkTo(methodOn(ProductController.class).readProduct(productUid, null)).withRel("product"));
        }
    }
}

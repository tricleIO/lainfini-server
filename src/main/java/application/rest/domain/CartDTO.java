package application.rest.domain;

import application.persistence.entity.Cart;
import application.persistence.type.CartStatus;
import application.rest.CartController;
import application.rest.UserController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Cart> {

    private Long uid;
    private Long ownerUid;
    private Date createdAt;
    private List<ItemDTO> products = new LinkedList<>();
    private CartStatus status;
    private String createdFrom;

    // for create
    private UserDTO owner;

    @Override
    public Cart toEntity() {
        Cart cart = new Cart();
        cart.setId(uid);
        cart.setCreatedAt(new Date());
        if (owner != null) {
            cart.setOwner(owner.toEntity());
        }
        cart.setStatus(status);
        cart.setCreatedFrom(createdFrom);
        return cart;
    }

    public void addItem(ItemDTO itemDTO) {
        products.add(itemDTO);
    }

    @Override
    public void addLinks() {
        add(linkTo(methodOn(CartController.class).readCart(uid)).withSelfRel());
        if (ownerUid != null) {
            add(linkTo(methodOn(UserController.class).readUser(ownerUid)).withRel("owner"));
        }
        for (ItemDTO item : products) {
            item.addLinks();
        }
    }

}

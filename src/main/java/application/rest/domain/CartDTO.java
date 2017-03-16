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
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Cart>, IdentifableDTO<UUID> {

    private UUID uid;
    private UUID customerUid;
    private Date createdAt;
    private List<ItemDTO> items = new LinkedList<>();
    private CartStatus status;
    private String createdFrom;

    // for create
    private UserDTO customer;

    @Override
    public Cart toEntity(boolean selectAsParent, Object... parentParams) {
        Cart cart = new Cart();
        cart.setId(uid);
        cart.setCreatedAt(new Date());
        if (customer != null) {
            cart.setCustomer(customer.toEntity(false));
        }
        cart.setStatus(status);
        cart.setCreatedFrom(createdFrom);
        return cart;
    }

    public void addItem(ItemDTO itemDTO) {
        items.add(itemDTO);
    }

    @Override
    public void addLinks() {
        add(linkTo(methodOn(CartController.class).readCart(uid)).withSelfRel());
        if (customerUid != null) {
            add(linkTo(methodOn(UserController.class).readUser(customerUid)).withRel("customer"));
        }
        for (ItemDTO item : items) {
            item.addLinks();
        }
    }

}

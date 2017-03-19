package application.rest.domain;

import application.persistence.entity.Cart;
import application.persistence.type.CartStatus;
import application.rest.CartController;
import application.rest.UserController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Cart>, IdentifableDTO<UUID> {

    private UUID uid;
    private UUID customerUid;
    private Date createdAt;
    private Set<CartItemDTO> items;
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
        if (status == null) {
            status = CartStatus.OPENED;
        }
        cart.setStatus(status);
        cart.setCreatedFrom(createdFrom);
        return cart;
    }

    @Override
    public void addLinks() {
        add(linkTo(methodOn(CartController.class).readCart(uid)).withSelfRel());
        if (customerUid != null) {
            add(linkTo(methodOn(UserController.class).readUser(customerUid)).withRel("customer"));
        }
        if (items != null) {
            if (items != null) {
                for (CartItemDTO item : items) {
                    item.addLinks();
                }
            }
        }
    }

}

package application.rest.domain;

import application.persistence.entity.Cart;
import application.rest.CartController;
import application.rest.CustomerController;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
public class CartDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Cart> {

    private Long uid;
    private Long ownerUid;
    private Date createdAt;
    private List<ItemDTO> products = new LinkedList<>();

    @Override
    public Cart toEntity() {
        Cart cart = new Cart();
        cart.setId(uid);
        cart.setCreatedAt(new Date());
        return cart;
    }

    public void addItem(ItemDTO itemDTO) {
        products.add(itemDTO);
    }

    @Override
    public void addLinks() {
        add(linkTo(methodOn(CartController.class).readCart(uid)).withSelfRel());
        if (ownerUid != null) {
            add(linkTo(methodOn(CustomerController.class).readCustomer(ownerUid)).withRel("owner"));
        }
        for (ItemDTO item : products) {
            item.addLinks();
        }
    }

}

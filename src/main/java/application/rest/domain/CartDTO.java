package application.rest.domain;

import application.persistence.entity.Cart;
import lombok.Data;

import java.util.Date;

@Data
public class CartDTO implements ReadWriteDatabaseDTO<Cart> {

    private Long uid;
    private Long ownerId;
    private Date createdAt;

    @Override
    public Cart toEntity() {
        Cart cart = new Cart();
        cart.setCreatedAt(new Date());
        return cart;
    }

}

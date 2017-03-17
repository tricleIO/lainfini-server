package application.service.cart;

import application.persistence.entity.Cart;
import application.rest.domain.CartDTO;
import application.service.BaseDatabaseService;

import java.util.UUID;

public interface CartService extends BaseDatabaseService<Cart, UUID, CartDTO> {

}

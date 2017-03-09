package application.service.cart;

import application.persistence.entity.Cart;
import application.rest.domain.CartDTO;
import application.rest.domain.ItemDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;

import java.util.UUID;

public interface CartService extends BaseDatabaseService<Cart, UUID, CartDTO> {

    ServiceResponse<CartDTO> addProductToCart(UUID cartId, ItemDTO item);

}

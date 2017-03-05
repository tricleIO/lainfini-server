package application.service.cart;

import application.persistence.entity.Cart;
import application.rest.domain.CartDTO;
import application.rest.domain.ItemDTO;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;

public interface CartService extends DatabaseServiceInterface<Cart, Long, CartDTO> {

    ServiceResponse<CartDTO> addProductToCart(Long cartId, ItemDTO item);

}

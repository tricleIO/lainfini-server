package application.service.cart;

import application.persistence.entity.Cart;
import application.rest.domain.CartDTO;
import application.rest.domain.ItemDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;

public interface CartService extends BaseDatabaseService<Cart, Long, CartDTO> {

    ServiceResponse<CartDTO> addProductToCart(Long cartId, ItemDTO item);

}

package application.service.cart;

import application.persistence.entity.Cart;
import application.rest.domain.*;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;

public interface CartService extends DatabaseServiceInterface<Cart, Long, CartDTO> {

    ServiceResponse<ItemDTO> addProductToCart(Long cartId, ItemDTO item);

}

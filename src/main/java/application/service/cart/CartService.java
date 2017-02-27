package application.service.cart;

import application.persistence.entity.Address;
import application.persistence.entity.Cart;
import application.rest.domain.AddressDTO;
import application.rest.domain.CartDTO;
import application.rest.domain.CartHasProductDTO;
import application.rest.domain.ProductDTO;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;

public interface CartService extends DatabaseServiceInterface<Cart, Long, CartDTO> {

    ServiceResponse<ProductDTO> addProductToCart(CartHasProductDTO cartHasProductDTO);

}

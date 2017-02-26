package application.service.cart;

import application.persistence.entity.Address;
import application.persistence.entity.Cart;
import application.rest.domain.AddressDTO;
import application.rest.domain.CartDTO;
import application.service.DatabaseServiceInterface;

public interface CartService extends DatabaseServiceInterface<Cart, Long, CartDTO> {

}

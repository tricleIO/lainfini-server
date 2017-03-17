package application.service.cartItem;

import application.persistence.entity.CartItem;
import application.rest.domain.CartItemDTO;
import application.service.BaseDatabaseService;

public interface CartItemService extends BaseDatabaseService<CartItem, Long, CartItemDTO> {

}

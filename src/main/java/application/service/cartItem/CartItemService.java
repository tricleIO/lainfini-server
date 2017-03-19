package application.service.cartItem;

import application.persistence.entity.CartItem;
import application.rest.domain.CartItemDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;

public interface CartItemService extends BaseDatabaseService<CartItem, Long, CartItemDTO> {

    ServiceResponse<CartItemDTO> put(CartItemDTO dto);

}

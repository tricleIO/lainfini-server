package application.rest;

import application.persistence.entity.CartItem;
import application.rest.domain.CartItemDTO;
import application.service.cartItem.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/carts")
public class CartItemController extends AbstractDatabaseController<CartItem, Long, CartItemDTO, CartItemService> {

    @Autowired
    private CartItemService cartItemService;

    @RequestMapping(value = "/{cartId}/items", method = RequestMethod.POST)
    public ResponseEntity<?> createCartItem(@PathVariable UUID cartId, @RequestBody CartItemDTO cart) {
        cart.setCartUid(cartId);
        return create(cart);
    }

    @RequestMapping(value = "/{cartId}/items", method = RequestMethod.PUT)
    public ResponseEntity<?> putCartItem(@PathVariable UUID cartId, @RequestBody CartItemDTO cart) {
        cart.setCartUid(cartId);
        return getSimpleResponseEntity(
                cartItemService.put(cart)
        );
    }

    @Override
    public CartItemService getBaseService() {
        return cartItemService;
    }

}
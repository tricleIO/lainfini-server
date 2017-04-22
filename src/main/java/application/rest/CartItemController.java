package application.rest;

import application.persistence.entity.CartItem;
import application.rest.domain.CartDTO;
import application.rest.domain.CartItemDTO;
import application.service.cart.CartService;
import application.service.cartItem.CartItemService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/carts")
public class CartItemController extends AbstractDatabaseController<CartItem, Long, CartItemDTO, CartItemService> {

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/{cartId}/items", method = RequestMethod.POST)
    public ResponseEntity<?> createCartItem(@PathVariable UUID cartId, @RequestBody CartItemDTO cart) {
        ServiceResponse<CartDTO> cartResponse = cartService.readCartSecured(cartId);
        if (!cartResponse.isSuccessful()) {
            return new ErrorResponseEntity(cartResponse.getStatus());
        }
        cart.setCartUid(cartId);
        return create(cart);
    }

    @RequestMapping(value = "/{cartId}/items", method = RequestMethod.PUT)
    public ResponseEntity<?> putCartItem(@PathVariable UUID cartId, @RequestBody CartItemDTO cart) {
        ServiceResponse<CartDTO> cartResponse = cartService.readCartSecured(cartId);
        if (!cartResponse.isSuccessful()) {
            return new ErrorResponseEntity(cartResponse.getStatus());
        }
        cart.setCartUid(cartId);
        return getSimpleResponseEntity(
                cartItemService.put(cart)
        );
    }

    @RequestMapping(value = "/{cartId}/items/{productId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCartItem(@PathVariable UUID cartId, @PathVariable UUID productId) {
        ServiceResponse<CartDTO> cartResponse = cartService.readCartSecured(cartId);
        if (!cartResponse.isSuccessful()) {
            return new ErrorResponseEntity(cartResponse.getStatus());
        }
        return getSimpleResponseEntity(
                cartItemService.removeProductFromCart(productId, cartId)
        );
    }

    @Override
    public CartItemService getBaseService() {
        return cartItemService;
    }

};
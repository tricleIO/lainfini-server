package application.rest;

import application.persistence.entity.Cart;
import application.rest.domain.CartDTO;
import application.rest.domain.ItemDTO;
import application.service.cart.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/carts")
public class CartController extends AbstractDatabaseController<Cart, UUID, CartDTO, CartService> {

    @Autowired
    private CartService cartService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCarts(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCart(@PathVariable UUID id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCart(@RequestBody CartDTO cart) {
        return create(cart);
    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.PATCH)
    public ResponseEntity<?> addProduct(@PathVariable UUID cartId, @RequestBody ItemDTO itemDTO) {
        return getSimpleResponseEntity(
                cartService.addProductToCart(cartId, itemDTO)
        );
    }

    @Override
    public CartService getBaseService() {
        return cartService;
    }

}
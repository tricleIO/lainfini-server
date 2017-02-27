package application.rest;

import application.persistence.entity.Cart;
import application.rest.domain.CartDTO;
import application.rest.domain.CartHasProductDTO;
import application.rest.domain.ProductDTO;
import application.service.cart.CartService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/carts")
public class CartController extends AbstractDatabaseController<Cart, Long, CartDTO, CartService> {

    @Autowired
    private CartService cartService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCarts(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCart(@PathVariable Long id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCart(@RequestBody CartDTO cart) {
        return create(cart);
    }

    @RequestMapping(value = "/{cartId}/products", method = RequestMethod.PATCH)
    public ResponseEntity<?> addProduct(@RequestBody CartHasProductDTO cartHasProduct) {
        ServiceResponse<?> response = cartService.addProductToCart(cartHasProduct);
        if (response.isSuccessful()) {
            return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
        }
        return new ErrorResponseEntity(response.getStatus());
    }

    @Override
    public CartService getBaseService() {
        return cartService;
    }

}
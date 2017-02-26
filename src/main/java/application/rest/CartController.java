package application.rest;

import application.persistence.entity.Cart;
import application.rest.domain.AddressDTO;
import application.rest.domain.CartDTO;
import application.service.cart.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/carts")
public class CartController extends AbstractDatabaseController<Cart, Long, CartDTO, CartService> {

    @Autowired
    private CartService cartService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readAddresses(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readAddress(@PathVariable Long id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createAddress(@RequestBody CartDTO cart) {
        return create(cart);
    }

    @Override
    public CartService getBaseService() {
        return cartService;
    }

}
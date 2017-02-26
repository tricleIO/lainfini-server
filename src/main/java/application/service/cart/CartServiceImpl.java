package application.service.cart;

import application.persistence.entity.Cart;
import application.persistence.entity.CartHasProduct;
import application.persistence.repository.CartHasProductRepository;
import application.persistence.repository.CartRepository;
import application.rest.domain.CartDTO;
import application.rest.domain.ItemDTO;
import application.service.AbstractDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl extends AbstractDatabaseService<Cart, Long, CartRepository, CartDTO> implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartHasProductRepository cartHasProductRepository;

    @Override
    public ServiceResponse<CartDTO> read(Long cartId) {
        // call original method
        ServiceResponse<CartDTO> response = super.read(cartId);
        // success
        if (response.isSuccessful()) {
            // add items of products to cart
            CartDTO cart = response.getBody();
            addItemsToCart(cart, getCartHasProductsByCartId(cartId));
        }
        return response;
    }

    @Override
    public ServiceResponse<Page<CartDTO>> readAll(Pageable pageable) {
        // call original method
        ServiceResponse<Page<CartDTO>> response = super.readAll(pageable);
        // success
        if (response.isSuccessful()) {
            // add items of products to carts
            List<CartDTO> carts = response.getBody().getContent();
            // @TODO - try think about optimization number of queries
            for (CartDTO cart : carts) {
                addItemsToCart(cart, getCartHasProductsByCartId(cart.getUid()));
            }
        }
        return response;
    }

    @Override
    public CartRepository getRepository() {
        return cartRepository;
    }

    private void addItemsToCart(CartDTO cart, List<CartHasProduct> cartHasProducts) {
        for (CartHasProduct cartHasProduct : cartHasProducts) {
            // create item and add it to product list
            cart.addItem(createCartItem(cartHasProduct));
        }
    }

    private ItemDTO createCartItem(CartHasProduct cartHasProduct) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setProductUid(cartHasProduct.getProduct().getId());
        itemDTO.setNumber(cartHasProduct.getNumber());
        return itemDTO;
    }

    private List<CartHasProduct> getCartHasProductsByCartId(Long cartId) {
        return cartHasProductRepository.findByCartId(cartId);
    }

}

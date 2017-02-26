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
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl extends AbstractDatabaseService<Cart, Long, CartRepository, CartDTO> implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartHasProductRepository cartHasProductRepository;

    @Override
    public ServiceResponse<CartDTO> read(Long key) {
        // call original method
        ServiceResponse<CartDTO> response = super.read(key);
        // success
        if (response.isSuccessful()) {
            CartDTO cartDTO = response.getBody();
            addItemsToCart(cartDTO, cartHasProductRepository.findByCartId(key));
            return ServiceResponse.success(cartDTO);
        }
        // delegate error response
        return response;
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

    @Override
    public CartRepository getRepository() {
        return cartRepository;
    }

}

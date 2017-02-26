package application.service.cart;

import application.persistence.entity.Cart;
import application.persistence.entity.CartHasProduct;
import application.persistence.entity.Customer;
import application.persistence.repository.CartHasProductRepository;
import application.persistence.repository.CartRepository;
import application.persistence.repository.CustomerRepository;
import application.rest.domain.CartDTO;
import application.rest.domain.CustomerDTO;
import application.rest.domain.ItemDTO;
import application.service.AbstractDatabaseService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
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

    @Autowired
    private CustomerRepository customerRepository;

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

    // add info about owner (customer)
    @Override
    public ServiceResponse<CartDTO> create(CartDTO cartDTO) {
        Customer customer = customerRepository.findOne(cartDTO.getOwnerId());
        if (customer == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        Cart cart = cartDTO.toEntity();
        cart.setOwner(customer);
        // @TODO - check errors!
        Cart savedCart = cartRepository.save(cart);
        return ServiceResponse.success(savedCart.toDTO());
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

package application.service.cart;

import application.persistence.entity.Cart;
import application.persistence.entity.CartHasProduct;
import application.persistence.repository.CartHasProductRepository;
import application.persistence.repository.CartRepository;
import application.rest.domain.CartDTO;
import application.rest.domain.ItemDTO;
import application.rest.domain.ProductDTO;
import application.rest.domain.UserDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CartServiceImpl extends BaseDatabaseServiceImpl<Cart, UUID, CartRepository, CartDTO> implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartHasProductRepository cartHasProductRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Override
    public ServiceResponse<CartDTO> read(UUID cartId) {
        // call original method
        ServiceResponse<CartDTO> response = super.read(cartId);
        // success
        if (response.isSuccessful()) {
            // add items of productFiles to cart
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
            // add items of productFiles to carts
            List<CartDTO> carts = response.getBody().getContent();
            // @TODO - try think about optimization number of queries
            for (CartDTO cart : carts) {
                addItemsToCart(cart, getCartHasProductsByCartId(cart.getUid()));
            }
        }
        return response;
    }

    @Override
    public ServiceResponse<CartDTO> addProductToCart(UUID cartId, ItemDTO item) {
        ServiceResponse<CartDTO> cartServiceResponse = read(cartId);
        // find cart
        if (!cartServiceResponse.isSuccessful()) {
            ServiceResponse.error(ServiceResponseStatus.CART_NOT_FOUND);
        }
        // find product
        ServiceResponse<ProductDTO> productServiceResponse = productService.read(item.getProductUid());
        if (!productServiceResponse.isSuccessful()) {
            ServiceResponse.error(ServiceResponseStatus.PRODUCT_NOT_FOUND);
        }

        Long countExistingPairs = cartHasProductRepository.countByCartIdAndProductId(cartId, item.getProductUid());
        if (countExistingPairs == 0) {
            // add product to cart (to CartHasProduct table)
            CartHasProduct cartHasProduct = new CartHasProduct();
            cartHasProduct.setCart(cartServiceResponse.getBody().toEntity(false));
            cartHasProduct.setProduct(productServiceResponse.getBody().toEntity(false));
            cartHasProduct.setQuantity(item.getQuantity());
            cartHasProductRepository.save(cartHasProduct);
        } else {
            // if pair exists, add number of given productFiles to original number of productFiles
            CartHasProduct foundCartHasProduct = cartHasProductRepository.findByCartIdAndProductId(
                    cartId, item.getProductUid()
            );
            foundCartHasProduct.setQuantity(foundCartHasProduct.getQuantity() + item.getQuantity());
            cartHasProductRepository.save(foundCartHasProduct);
        }
        // success, read patched cart
        return read(cartId);
    }

    // add info about owner (customer)
    @Override
    public ServiceResponse<CartDTO> create(CartDTO cartDTO) {
        ServiceResponse<UserDTO> ownerResponse = userService.read(cartDTO.getOwnerUid());
        if (!ownerResponse.isSuccessful()) {
            return ServiceResponse.error(ServiceResponseStatus.CART_OWNER_NOT_FOUND);
        }
        cartDTO.setOwner(ownerResponse.getBody());
        return super.create(cartDTO);
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
        itemDTO.setQuantity(cartHasProduct.getQuantity());
        return itemDTO;
    }

    private List<CartHasProduct> getCartHasProductsByCartId(UUID cartId) {
        return cartHasProductRepository.findByCartId(cartId);
    }

}

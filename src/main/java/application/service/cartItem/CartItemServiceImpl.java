package application.service.cartItem;

import application.persistence.entity.CartItem;
import application.persistence.repository.CartItemRepository;
import application.rest.domain.CartItemDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.cart.CartService;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CartItemServiceImpl extends BaseDatabaseServiceImpl<CartItem, Long, CartItemRepository, CartItemDTO> implements CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    @Override
    public ServiceResponse<CartItemDTO> create(CartItemDTO dto) {
        if (productInCartAlreadyExists(dto.getProductUid(), dto.getCartUid())) {
            return ServiceResponse.error(ServiceResponseStatus.ALREADY_EXISTS);
        }
        return super.create(dto);
    }

    @Override
    public ServiceResponse<CartItemDTO> put(CartItemDTO dto) {
        if (!productInCartAlreadyExists(dto.getProductUid(), dto.getCartUid())) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        CartItem cartItem = cartItemRepository.findByProductIdAndCartId(
                dto.getProductUid(), dto.getCartUid()
        );
        cartItem.setQuantity(dto.getQuantity());
        CartItem updatedCartItem = cartItemRepository.save(cartItem);
        return ServiceResponse.success(updatedCartItem.toDTO(true));
    }

    @Override
    protected AdditionalDataManipulatorBatch<CartItemDTO> getAdditionalDataLoaderBatch(CartItemDTO cartItemDTO) {
        AdditionalDataManipulatorBatch<CartItemDTO> batch = new AdditionalDataManipulatorBatch<>(cartItemDTO);
        // add cart
        batch.add(oi -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(oi.getCartUid(), cartService::read),
                new AdditionalDataManipulator.Writer<>(oi::setCart),
                ServiceResponseStatus.CART_NOT_FOUND)
        );
        // add product
        batch.add(oi -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(oi.getProductUid(), productService::read),
                new AdditionalDataManipulator.Writer<>(oi::setProduct),
                ServiceResponseStatus.PRODUCT_NOT_FOUND)
        );
        return batch;
    }

    @Override
    public CartItemRepository getRepository() {
        return cartItemRepository;
    }

    private boolean productInCartAlreadyExists(UUID productId, UUID cartId) {
        return cartItemRepository.countByProductIdAndCartId(productId, cartId) > 0;
    }

}

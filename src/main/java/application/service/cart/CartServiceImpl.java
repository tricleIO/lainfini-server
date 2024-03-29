package application.service.cart;

import application.persistence.entity.Cart;
import application.persistence.entity.CartItem;
import application.persistence.entity.User;
import application.persistence.repository.CartItemRepository;
import application.persistence.repository.CartRepository;
import application.persistence.type.CartStatusEnum;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.CartDTO;
import application.rest.domain.CartItemDTO;
import application.rest.domain.ProductDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.security.CustomUserDetails;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartServiceImpl extends BaseDatabaseServiceImpl<Cart, UUID, CartRepository, CartDTO> implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Override
    protected void additionalUpdateDto(CartDTO dto) {
        List<CartItem> items = cartItemRepository.findByCartId(dto.getUid());
        Set<CartItemDTO> itemDTOs = new HashSet<>();
        for (CartItem item : items) {
            CartItemDTO cartItemDTO = item.toDTO(false);
            ServiceResponse<ProductDTO> productResponse = productService.read(cartItemDTO.getProductUid());
            if (productResponse.isSuccessful()) {
                cartItemDTO.setProduct(productResponse.getBody());
            }
            itemDTOs.add(cartItemDTO);
        }
        dto.setItems(itemDTOs);
    }

    // @TODO - repair error with finOne in base service, not override here!
    @Override
    public ServiceResponse<CartDTO> read(UUID key) {
        Cart cart = cartRepository.findById(key);
        if (cart == null) {
            return ServiceResponse.error(ServiceResponseStatus.CART_NOT_FOUND);
        }
        CartDTO cartDTO = cart.toDTO(true);
        additionalUpdateDto(cartDTO);
        return ServiceResponse.success(cartDTO);
    }

    public ServiceResponse<CartDTO> readCurrentCustomersCart() {
        User user = CustomUserDetails.getCurrentUser();
        if (user == null) {
            return ServiceResponse.error(ServiceResponseStatus.UNAUTHORIZED);
        }
        Cart cart = cartRepository.findFirstByCustomerIdAndStatusOrderByCreatedAtDesc(user.getId(), CartStatusEnum.OPENED);
        if (cart == null) {
            CartDTO cartDTO = new CartDTO();
            cartDTO.setCustomerUid(user.getId());
            return create(cartDTO);
        }
        return read(cart.getId());
    }

    @Override
    public ServiceResponse<CartDTO> readCartSecured(UUID cartId) {
        ServiceResponse<CartDTO> cartResponse = read(cartId);
        if (cartResponse.isSuccessful()) {
            CartDTO cartDTO = cartResponse.getBody();
            // is admin
            ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                    UserRoleEnum.ROLE_ADMIN
            );
            if (cartDTO.getCustomerUid() != null) {
                // or its his
                ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(
                        cartDTO.getCustomerUid()
                );
                if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
                    return ServiceResponse.error(ServiceResponseStatus.FORBIDDEN);
                }
            }
        }
        return cartResponse;
    }

    public boolean isCartOpen(UUID cartId) {
        return cartRepository.countByIdAndStatus(cartId, CartStatusEnum.OPENED) > 0;
    }

    @Override
    protected ServiceResponse<CartDTO> doBeforeConvertInCreate(CartDTO dto) {
        dto.setCreatedAt(new Date());
        if (dto.getStatus() == null) {
            dto.setStatus(CartStatusEnum.OPENED);
        }
        return super.doBeforeConvertInCreate(dto);
    }

    @Override
    protected AdditionalDataManipulatorBatch<CartDTO> getAdditionalDataLoaderBatch(CartDTO dto) {
        AdditionalDataManipulatorBatch<CartDTO> batch = new AdditionalDataManipulatorBatch<>(dto);
        // add customer
        batch.add(o -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(o.getCustomerUid(), userService::read),
                new AdditionalDataManipulator.Writer<>(o::setCustomer),
                ServiceResponseStatus.CUSTOMER_NOT_FOUND)
        );
        return batch;
    }

    @Override
    public CartRepository getRepository() {
        return cartRepository;
    }

}

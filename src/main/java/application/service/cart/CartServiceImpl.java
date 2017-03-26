package application.service.cart;

import application.persistence.entity.Cart;
import application.persistence.entity.User;
import application.persistence.repository.CartRepository;
import application.persistence.type.CartStatusEnum;
import application.rest.domain.CartDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.security.CustomUserDetails;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CartServiceImpl extends BaseDatabaseServiceImpl<Cart, UUID, CartRepository, CartDTO> implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserService userService;

    @Override
    public ServiceResponse<CartDTO> read(UUID key) {
        Cart cart = cartRepository.findOneById(key);
        if (cart == null) {
            return ServiceResponse.error(ServiceResponseStatus.CART_NOT_FOUND);
        }
        return ServiceResponse.success(cart.toDTO(true));
    }

    public ServiceResponse<CartDTO> readCurrentCustomersCart() {
        User user = CustomUserDetails.getCurrentUser();
        if (user == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        Cart cart = cartRepository.findFirstByCustomerIdAndStatusOrderByCreatedAtDesc(user.getId(), CartStatusEnum.OPENED);
        if (cart == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        return ServiceResponse.success(cart.toDTO(false));
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

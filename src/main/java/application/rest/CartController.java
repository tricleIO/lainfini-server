package application.rest;

import application.persistence.entity.Cart;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.CartDTO;
import application.service.cart.CartService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
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

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCarts(Pageable pageable) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCart(@PathVariable UUID id) {
        ServiceResponse<CartDTO> cartResponse = cartService.read(id);
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
                    return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
                }
            } else {
                if (!hasRolesResponse.isSuccessful()) {
                    return new ErrorResponseEntity(hasRolesResponse.getStatus());
                }
            }
        }
        return getSimpleResponseEntity(cartResponse);
    }

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public ResponseEntity<?> readCurrentCart() {
        return getSimpleResponseEntity(
                cartService.readCurrentCustomersCart()
        );
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCart(@RequestBody CartDTO cart) {
        return create(cart);
    }

    @Override
    public CartService getBaseService() {
        return cartService;
    }

}
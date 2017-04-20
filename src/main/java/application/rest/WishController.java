package application.rest;

import application.persistence.entity.Wish;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.WishDTO;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import application.service.wish.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class WishController extends AbstractDatabaseController<Wish, Long, WishDTO, WishService> {

    @Autowired
    private WishService wishService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/customers/{customerId}/wishlist", method = RequestMethod.GET)
    public ResponseEntity<?> readUsersWishes(@PathVariable UUID customerId, Pageable pageable) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(customerId);
        if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
        }
        return getPageResponseEntity(
                wishService.readCustomersWishes(customerId, pageable)
        );
    }

    @RequestMapping(value = "/customers/current/wishlist", method = RequestMethod.GET)
    public ResponseEntity<?> readUsersWishes(Pageable pageable) {
        return getPageResponseEntity(
                wishService.readCurrentCustomersWishes(pageable)
        );
    }

    @RequestMapping(value = "/customers/{customerId}/wishlist/{wishId}", method = RequestMethod.GET)
    public ResponseEntity<?> readWish(@PathVariable UUID customerId, @PathVariable Long wishId) {
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(customerId);
        if (!isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(isCurrentUserResponse.getStatus());
        }
        return read(wishId);
    }

    @RequestMapping(value = "/customers/{customerId}/wishlist", method = RequestMethod.POST)
    public ResponseEntity<?> createWish(@PathVariable UUID customerId, @RequestBody WishDTO wishDTO) {
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(customerId);
        if (!isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(isCurrentUserResponse.getStatus());
        }
        wishDTO.setCustomerUid(customerId);
        return create(wishDTO);
    }

    @RequestMapping(value = "/customers/current/wishlist", method = RequestMethod.POST)
    public ResponseEntity<?> createWish(@RequestBody WishDTO wishDTO) {
        return getSimpleResponseEntity(
                wishService.createWishToCurrentUser(wishDTO)
        );
    }

    @RequestMapping(value = "/customers/{customerId}/wishlist/{productId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteWish(@PathVariable UUID customerId, @PathVariable UUID productId) {
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(customerId);
        if (!isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(isCurrentUserResponse.getStatus());
        }
        return getSimpleResponseEntity(
                wishService.removeProductFromWishes(customerId, productId)
        );
    }

    @RequestMapping(value = "/customers/current/wishlist/{productId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCurrentCustomerWish(@PathVariable UUID productId) {
        return getSimpleResponseEntity(
                wishService.removeProductFromWishesOfCurrentCustomer(productId)
        );
    }

    @Override
    public WishService getBaseService() {
        return wishService;
    }


}
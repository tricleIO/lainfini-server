package application.rest;

import application.persistence.entity.Wish;
import application.rest.domain.WishDTO;
import application.service.response.ServiceResponseStatus;
import application.service.security.CustomUserDetails;
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
        if (CustomUserDetails.getCurrentUser() == null) {
            return new ErrorResponseEntity(ServiceResponseStatus.UNAUTHORIZED);
        }
//        // has logged user demanded roles
//        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
//                UserRoleEnum.ROLE_ADMIN
//        );
        // error
        if (!CustomUserDetails.getCurrentUser().getId().equals(customerId)) {
            return new ErrorResponseEntity(ServiceResponseStatus.READ_FORBIDDEN);
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
        if (CustomUserDetails.getCurrentUser() != null) {
            return new ErrorResponseEntity(ServiceResponseStatus.UNAUTHORIZED);
        }
        if (!CustomUserDetails.getCurrentUser().getId().equals(customerId)) {
            return new ErrorResponseEntity(ServiceResponseStatus.READ_FORBIDDEN);
        }
        return read(wishId);
    }

    @RequestMapping(value = "/customers/{customerId}/wishlist", method = RequestMethod.POST)
    public ResponseEntity<?> createWish(@PathVariable UUID customerId, @RequestBody WishDTO wishDTO) {
        if (CustomUserDetails.getCurrentUser() != null) {
            return new ErrorResponseEntity(ServiceResponseStatus.UNAUTHORIZED);
        }
        if (!CustomUserDetails.getCurrentUser().getId().equals(customerId)) {
            return new ErrorResponseEntity(ServiceResponseStatus.READ_FORBIDDEN);
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
        if (CustomUserDetails.getCurrentUser() != null) {
            return new ErrorResponseEntity(ServiceResponseStatus.UNAUTHORIZED);
        }
        if (!CustomUserDetails.getCurrentUser().getId().equals(customerId)) {
            return new ErrorResponseEntity(ServiceResponseStatus.READ_FORBIDDEN);
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
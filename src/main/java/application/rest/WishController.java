package application.rest;

import application.persistence.entity.Wish;
import application.rest.domain.WishDTO;
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

    @RequestMapping(value = "/customers/{customerId}/wishlist", method = RequestMethod.GET)
    public ResponseEntity<?> readUsersWishes(@PathVariable UUID customerId, Pageable pageable) {
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
    public ResponseEntity<?> readAddress(@PathVariable UUID customerId, @PathVariable Long wishId) {
        return read(wishId);
    }

    @RequestMapping(value = "/customers/{customerId}/wishlist", method = RequestMethod.POST)
    public ResponseEntity<?> createWish(@PathVariable UUID customerId, @RequestBody WishDTO wishDTO) {
        wishDTO.setCustomerUid(customerId);
        return create(wishDTO);
    }

    @RequestMapping(value = "/customers/current/wishlist", method = RequestMethod.POST)
    public ResponseEntity<?> createWish(@RequestBody WishDTO wishDTO) {
        return getSimpleResponseEntity(
                wishService.createWishToCurrentUser(wishDTO)
        );
    }

    @Override
    public WishService getBaseService() {
        return wishService;
    }

}
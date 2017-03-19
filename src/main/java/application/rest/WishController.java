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
@RequestMapping(value = "users/{customerId}/wishlist")
public class WishController extends AbstractDatabaseController<Wish, Long, WishDTO, WishService> {

    @Autowired
    private WishService wishService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readUsersWishes(@PathVariable UUID customerId, Pageable pageable) {
        return getPageResponseEntity(
                wishService.readCustomersWishes(customerId, pageable)
        );
    }

    @RequestMapping(value = "/{wishId}", method = RequestMethod.GET)
    public ResponseEntity<?> readAddress(@PathVariable UUID customerId, @PathVariable Long wishId) {
        return read(wishId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createWish(@PathVariable UUID customerId, @RequestBody WishDTO wishDTO) {
        wishDTO.setCustomerUid(customerId);
        return create(wishDTO);
    }

    @Override
    public WishService getBaseService() {
        return wishService;
    }

}
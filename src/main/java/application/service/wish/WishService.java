package application.service.wish;

import application.persistence.entity.Wish;
import application.rest.domain.WishDTO;
import application.service.BaseSoftDeletableDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface WishService extends BaseSoftDeletableDatabaseService<Wish, Long, WishDTO> {

    ServiceResponse<Page<WishDTO>> readCurrentCustomersWishes(Pageable pageable);
    ServiceResponse<WishDTO> createWishToCurrentUser(WishDTO dto);
    ServiceResponse<Page<WishDTO>> readCustomersWishes(UUID customerId, Pageable pageable);
    ServiceResponse<WishDTO> removeProductFromWishes(UUID customerId, UUID productId);
    ServiceResponse<WishDTO> removeProductFromWishesOfCurrentCustomer(UUID productId);

}

package application.service.wish;

import application.persistence.entity.Wish;
import application.rest.domain.WishDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface WishService extends BaseDatabaseService<Wish, Long, WishDTO> {

    ServiceResponse<Page<WishDTO>> readCustomersWishes(UUID customerId, Pageable pageable);

}

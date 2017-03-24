package application.persistence.repository;

import application.persistence.entity.Wish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface WishRepository extends PagingAndSortingRepository<Wish, Long> {

    Page<Wish> findByCustomerId(UUID customerId, Pageable pageable);
    Long countByProductIdAndCustomerId(UUID productId, UUID customerId);

}
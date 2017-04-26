package application.persistence.repository;

import application.persistence.entity.Wish;
import application.persistence.type.StatusEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface WishRepository extends PagingAndSortingRepository<Wish, Long>, SoftDeletableRepository<Wish> {

    Page<Wish> findByCustomerIdAndStatus(UUID customerId, StatusEnum status, Pageable pageable);
    Long countByProductIdAndCustomerId(UUID productId, UUID customerId);
    Wish findByCustomerIdAndProductId(UUID customerId, UUID productId);

}
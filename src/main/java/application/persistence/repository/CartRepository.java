package application.persistence.repository;

import application.persistence.entity.Cart;
import application.persistence.type.CartStatusEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CartRepository extends PagingAndSortingRepository<Cart, UUID> {

    Page<Cart> findByStatus(CartStatusEnum status, Pageable pageable);
    Cart findById(UUID id);
    Cart findFirstByCustomerIdAndStatusOrderByCreatedAtDesc(UUID customerId, CartStatusEnum cartStatus);

}
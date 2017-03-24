package application.persistence.repository;

import application.persistence.entity.Cart;
import application.persistence.type.CartStatusEnum;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CartRepository extends PagingAndSortingRepository<Cart, UUID> {

    Cart findFirstByCustomerIdAndStatusOrderByCreatedAtDesc(UUID customerId, CartStatusEnum cartStatus);

}
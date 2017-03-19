package application.persistence.repository;

import application.persistence.entity.CartItem;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CartItemRepository extends PagingAndSortingRepository<CartItem, Long> {

    Long countByProductIdAndCartId(UUID productId, UUID cartId);
    CartItem findByProductIdAndCartId(UUID productId, UUID cartId);

}
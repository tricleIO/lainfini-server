package application.persistence.repository;

import application.persistence.entity.CartItem;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface CartItemRepository extends PagingAndSortingRepository<CartItem, Long> {

    List<CartItem> findByCartId(UUID cartId);
    Long countByProductIdAndCartId(UUID productId, UUID cartId);
    CartItem findByProductIdAndCartId(UUID productId, UUID cartId);

}
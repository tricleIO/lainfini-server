package application.persistence.repository;

import application.persistence.entity.CartHasProduct;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface CartHasProductRepository extends PagingAndSortingRepository<CartHasProduct, Long> {

    List<CartHasProduct> findByCartId(UUID id);
    Long countByCartIdAndProductId(UUID cartId, UUID productId);
    CartHasProduct findByCartIdAndProductId(UUID cartId, UUID productId);

}
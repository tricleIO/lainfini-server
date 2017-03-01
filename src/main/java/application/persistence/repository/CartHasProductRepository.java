package application.persistence.repository;

import application.persistence.entity.CartHasProduct;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CartHasProductRepository extends PagingAndSortingRepository<CartHasProduct, Long> {

    List<CartHasProduct> findByCartId(Long id);

    Long countByCartIdAndProductId(Long cartId, Long productId);

    CartHasProduct findByCartIdAndProductId(Long cartId, Long productId);

}
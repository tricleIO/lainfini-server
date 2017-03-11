package application.persistence.repository;

import application.persistence.entity.ProductHasFlash;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface ProductHasFlashRepository extends PagingAndSortingRepository<ProductHasFlash, Integer> {

    Long countByProductId(UUID productId);
    List<ProductHasFlash> findByProductId(UUID productId);
    Long countByProductIdAndFlashId(UUID productId, Integer flashId);

}
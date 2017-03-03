package application.persistence.repository;

import application.persistence.entity.ProductHasFlash;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductHasFlashRepository extends PagingAndSortingRepository<ProductHasFlash, Integer> {

    Long countByProductId(Long productId);
    List<ProductHasFlash> findByProductId(Long productId);

}
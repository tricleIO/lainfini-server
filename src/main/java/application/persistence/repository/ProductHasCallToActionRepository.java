package application.persistence.repository;

import application.persistence.entity.ProductHasCallToAction;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductHasCallToActionRepository extends PagingAndSortingRepository<ProductHasCallToAction, Integer> {

    Long countByProductId(Long productId);
    List<ProductHasCallToAction> findByProductId(Long productId);

}
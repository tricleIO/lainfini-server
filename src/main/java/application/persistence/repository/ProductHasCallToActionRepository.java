package application.persistence.repository;

import application.persistence.entity.ProductHasCallToAction;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface ProductHasCallToActionRepository extends PagingAndSortingRepository<ProductHasCallToAction, Integer> {

    Long countByProductId(UUID productId);
    List<ProductHasCallToAction> findByProductId(UUID productId);

}
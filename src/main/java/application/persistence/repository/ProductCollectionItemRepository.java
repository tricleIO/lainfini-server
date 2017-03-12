package application.persistence.repository;

import application.persistence.entity.ProductCollectionItem;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductCollectionItemRepository extends PagingAndSortingRepository<ProductCollectionItem, Integer> {

}
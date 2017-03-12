package application.persistence.repository;

import application.persistence.entity.ProductCollection;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductCollectionRepository extends PagingAndSortingRepository<ProductCollection, Integer> {

}
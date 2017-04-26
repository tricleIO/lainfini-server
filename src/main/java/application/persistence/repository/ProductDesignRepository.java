package application.persistence.repository;

import application.persistence.entity.ProductDesign;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDesignRepository extends PagingAndSortingRepository<ProductDesign, Integer> {

}
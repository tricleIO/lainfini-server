package application.persistence.repository;

import application.persistence.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    Page<Product> findByCategoryId(Integer categoryId, Pageable pageable);
    Page<Product> findByCategoryIdIn(List<Integer> categoryIds, Pageable pageable);

}
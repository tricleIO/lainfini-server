package application.persistence.repository;

import application.persistence.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends PagingAndSortingRepository<Product, UUID>, SoftDeletableRepository<Product> {

    Page<Product> findByCategoryId(Integer categoryId, Pageable pageable);
    Page<Product> findByCategoryIdIn(List<Integer> categoryIds, Pageable pageable);
    Product findOneByUrlSlug(String urlSlug);

}
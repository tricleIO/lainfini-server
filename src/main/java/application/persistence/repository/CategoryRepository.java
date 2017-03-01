package application.persistence.repository;

import application.persistence.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {

    Page<Category> findByParentId(Integer parentId, Pageable pageable);
    Page<Category> findByParentIsNull(Pageable pageable);

}
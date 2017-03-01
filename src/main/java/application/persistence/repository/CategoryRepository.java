package application.persistence.repository;

import application.persistence.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {

    List<Category> findByParentId(Integer parentId);
    Page<Category> findByParentId(Integer parentId, Pageable pageable);
    Page<Category> findByParentIsNull(Pageable pageable);

}
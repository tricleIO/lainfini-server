package application.service.category;

import application.persistence.entity.Category;
import application.rest.domain.CategoryDTO;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService extends DatabaseServiceInterface<Category, Integer, CategoryDTO> {

    ServiceResponse<CategoryDTO> createSubcategory(int parentCategoryId, CategoryDTO subcategoryDTO);
    ServiceResponse<Page<CategoryDTO>> readSubcategories(int parentCategoryId, Pageable pageable);

}

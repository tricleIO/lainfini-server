package application.service.category;

import application.persistence.entity.Category;
import application.persistence.repository.CategoryRepository;
import application.rest.domain.CategoryDTO;
import application.service.AbstractDatabaseService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends AbstractDatabaseService<Category, Integer, CategoryRepository, CategoryDTO> implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ServiceResponse<Page<CategoryDTO>> readMainCategories(Pageable pageable) {
        Page<Category> categoryPage = categoryRepository.findByParentIsNull(pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(categoryPage, pageable)
        );
    }

    public ServiceResponse<Page<CategoryDTO>> readSubcategories(int parentCategoryId, Pageable pageable) {
        Page<Category> categoryPage = categoryRepository.findByParentId(parentCategoryId, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(categoryPage, pageable)
        );
    }

    @Override
    public ServiceResponse<CategoryDTO> createSubcategory(int parentCategoryId, CategoryDTO subcategoryDTO) {
        // additional setting parent category dto for right convert to entity
        // find parent category
        ServiceResponse<CategoryDTO> parentCategoryResponse = read(parentCategoryId);
        // error
        if (!parentCategoryResponse.isSuccessful()) {
            return ServiceResponse.error(ServiceResponseStatus.PARENT_CATEGORY_NOT_FOUND);
        }
        // success
        subcategoryDTO.setParentCategory(parentCategoryResponse.getBody());
        // use original create method with possibility of updated dto object
        return super.create(subcategoryDTO);
    }

    @Override
    public CategoryRepository getRepository() {
        return categoryRepository;
    }

}

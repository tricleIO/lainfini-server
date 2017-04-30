package application.service.category;

import application.persistence.entity.Category;
import application.persistence.repository.CategoryRepository;
import application.rest.domain.CategoryDTO;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<Category, Integer, CategoryRepository, CategoryDTO> implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ServiceResponse<Page<CategoryDTO>> readMainCategories(Pageable pageable) {
        Page<Category> categoryPage = categoryRepository.findByParentCategoryIsNull(pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(categoryPage, pageable)
        );
    }

    public ServiceResponse<Page<CategoryDTO>> readSubcategories(int parentCategoryId, Pageable pageable) {
        Page<Category> categoryPage = categoryRepository.findByParentCategoryId(parentCategoryId, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(categoryPage, pageable)
        );
    }

    @Override
    public ServiceResponse<CategoryDTO> createSubcategory(int parentCategoryId, CategoryDTO subcategoryDTO) {
        // additional setting parentCategory category dto for right convert to entity
        // find parentCategory category
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

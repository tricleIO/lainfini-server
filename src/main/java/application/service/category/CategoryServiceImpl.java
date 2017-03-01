package application.service.category;

import application.persistence.entity.Category;
import application.persistence.repository.CategoryRepository;
import application.rest.domain.CategoryDTO;
import application.service.AbstractDatabaseService;
import application.service.address.AddressService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends AbstractDatabaseService<Category, Integer, CategoryRepository, CategoryDTO> implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ServiceResponse<CategoryDTO> create(CategoryDTO categoryDTO) {
        // additional setting parent category dto for right convert to entity
        if (categoryDTO.getParentCategoryUid() != null) {
            // find parent category
            ServiceResponse<CategoryDTO> parentCategoryResponse = read(categoryDTO.getParentCategoryUid());
            // error
            if (!parentCategoryResponse.isSuccessful()) {
                return ServiceResponse.error(ServiceResponseStatus.PARENT_CATEGORY_NOT_FOUND);
            }
            // success
            categoryDTO.setParentCategory(parentCategoryResponse.getBody());
        }
        // use original create method with possibility of updated dto object
        return super.create(categoryDTO);
    }

    @Override
    public CategoryRepository getRepository() {
        return categoryRepository;
    }

}

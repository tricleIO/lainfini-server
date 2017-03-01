package application.service.product;

import application.persistence.entity.Category;
import application.persistence.entity.Product;
import application.persistence.repository.CategoryRepository;
import application.persistence.repository.ProductRepository;
import application.rest.domain.ProductDTO;
import application.service.AbstractDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class ProductServiceImpl extends AbstractDatabaseService<Product, Long, ProductRepository, ProductDTO> implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ServiceResponse<Page<ProductDTO>> readProductsInCategory(Integer category, Pageable pageable) {
        Page<Product> pageWithProducts = productRepository.findByCategoryId(category, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(pageWithProducts, pageable)
        );
    }

    @Override
    public ServiceResponse<Page<ProductDTO>> readProductsInCategoryAndSubcategories(Integer categoryId, Pageable pageable) {
        List<Integer> categoryIds = getCategoryAndAllSubcategoriesIds(categoryId);
        Page<Product> pageWithProducts = productRepository.findByCategoryIdIn(categoryIds, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(pageWithProducts, pageable)
        );
    }

    private List<Integer> getCategoryAndAllSubcategoriesIds(Integer categoryId) {
        // @TODO - think about memory and query optimization
        List<Integer> categoryIds = new LinkedList<>();
        categoryIds.add(categoryId);

        // by queue mechanism add all subcategory ids
        Queue<Category> categoryQueue = new LinkedList<>();
        categoryQueue.addAll(categoryRepository.findByParentId(categoryId));
        while (!categoryQueue.isEmpty()) {
            Category currentCategory = categoryQueue.remove();
            categoryIds.add(currentCategory.getId());
            // add all subcategories of current category to queue
            categoryQueue.addAll(categoryRepository.findByParentId(currentCategory.getId()));
        }

        return categoryIds;
    }

    @Override
    public ProductRepository getRepository() {
        return productRepository;
    }

}

package application.service.product;

import application.persistence.entity.Product;
import application.rest.domain.ProductDTO;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService extends DatabaseServiceInterface<Product, Long, ProductDTO> {

    ServiceResponse<Page<ProductDTO>> readProductsInCategory(Integer category, Pageable pageable);
    ServiceResponse<Page<ProductDTO>> readProductsInCategoryAndSubcategories(Integer categoryId, Pageable pageable);

}

package application.service.product;

import application.persistence.entity.Product;
import application.rest.domain.ProductDTO;
import application.rest.domain.ProductHasFlashDTO;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.security.Principal;

public interface ProductService extends DatabaseServiceInterface<Product, Long, ProductDTO> {

    ServiceResponse<ProductDTO> read(Long key, Principal principal);
    ServiceResponse<Page<ProductDTO>> readProductsInCategoryAndSubcategories(Integer categoryId, Pageable pageable, Principal principal);
    ServiceResponse<ProductDTO> addFlash(ProductHasFlashDTO productHasFlash);

}

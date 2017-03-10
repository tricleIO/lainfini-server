package application.service.product;

import application.persistence.entity.Product;
import application.rest.domain.ProductDTO;
import application.rest.domain.ProductHasFlashDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.security.Principal;

public interface ProductService extends BaseDatabaseService<Product, Long, ProductDTO> {

    ServiceResponse<ProductDTO> read(Long key, Principal principal);
    ServiceResponse<Page<ProductDTO>> readAll(Pageable pageable, Principal principal);
    ServiceResponse<Page<ProductDTO>> readProductsInCategoryAndSubcategories(Integer categoryId, Pageable pageable, Principal principal);
    ServiceResponse<ProductDTO> addFlash(ProductHasFlashDTO productHasFlash);


}

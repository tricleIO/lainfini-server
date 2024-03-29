package application.service.product;

import application.persistence.entity.Product;
import application.persistence.repository.ProductRepository;
import application.rest.domain.LocalProductAvailabilityDTO;
import application.rest.domain.ProductDTO;
import application.rest.domain.ProductHasFlashDTO;
import application.service.BaseDatabaseService;
import application.service.SlugService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.security.Principal;
import java.util.UUID;

public interface ProductService extends BaseDatabaseService<Product, UUID, ProductDTO>, SlugService<Product, ProductRepository, ProductDTO> {

    ServiceResponse<ProductDTO> read(UUID key, Principal principal);
    ServiceResponse<Page<ProductDTO>> readAll(Pageable pageable, Principal principal);
    ServiceResponse<Page<ProductDTO>> readProductsInCategoryAndSubcategories(Integer categoryId, Pageable pageable, Principal principal);
    ServiceResponse<ProductDTO> addFlash(ProductHasFlashDTO productHasFlash);
    ServiceResponse<Page<ProductDTO>> findByImagesPfFileId(Long imageId);
    ServiceResponse<LocalProductAvailabilityDTO> readProductAvailability(UUID productId);

}

package application.rest;

import application.persistence.entity.Product;
import application.rest.domain.ProductDTO;
import application.rest.domain.ProductHasFlashDTO;
import application.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.UUID;

@RestController
@RequestMapping(value = "/products")
public class ProductController extends AbstractDatabaseController<Product, UUID, ProductDTO, ProductService> {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readProducts(Pageable pageable, Principal principal) {
        return getPageResponseEntity(
                productService.readAll(pageable, principal)
        );
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readProduct(@PathVariable UUID id, Principal principal) {
        return getSimpleResponseEntity(
                productService.read(id, principal)
        );
    }

    @RequestMapping(value = "/slug/{slug}", method = RequestMethod.GET)
    public ResponseEntity<?> readProductBySlug(@PathVariable String slug) {
        return getSimpleResponseEntity(
                productService.read(slug)
        );
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createProduct(@RequestBody ProductDTO product) {
        return create(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProduct(@PathVariable UUID id) {
        return getSimpleResponseEntity(
                productService.delete(id)
        );
    }

    @RequestMapping(value = "/{productId}/flashes", method = RequestMethod.POST)
    public ResponseEntity<?> addFlash(@PathVariable UUID productId, @RequestBody ProductHasFlashDTO productHasFlash) {
        productHasFlash.setProductUid(productId);
        return getSimpleResponseEntity(
                productService.addFlash(productHasFlash)
        );
    }

    @Override
    public ProductService getBaseService() {
        return productService;
    }

}
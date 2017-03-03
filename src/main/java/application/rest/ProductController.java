package application.rest;

import application.persistence.entity.Product;
import application.rest.domain.ProductDTO;
import application.rest.domain.ProductHasFlashDTO;
import application.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController extends AbstractDatabaseController<Product, Long, ProductDTO, ProductService> {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readProducts(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readProduct(@PathVariable Long id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createProduct(@RequestBody ProductDTO product) {
        return create(product);
    }

    @RequestMapping(value = "/{productId}/flashes", method = RequestMethod.POST)
    public ResponseEntity<?> addFlash(@PathVariable Long productId, @RequestBody ProductHasFlashDTO productHasFlash) {
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
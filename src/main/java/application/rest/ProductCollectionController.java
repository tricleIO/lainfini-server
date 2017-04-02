package application.rest;

import application.persistence.entity.ProductCollection;
import application.rest.domain.ProductCollectionDTO;
import application.service.productCollection.ProductCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products/collections")
public class ProductCollectionController extends AbstractDatabaseController<ProductCollection, Integer, ProductCollectionDTO, ProductCollectionService> {

    @Autowired
    private ProductCollectionService productCollectionService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCollection(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCollections(Pageable pageable, @RequestParam(name = "slug", required = false) String slug) {
        if (slug != null) {
            return getSimpleResponseEntity(
                    productCollectionService.readBySlug(slug)
            );
        }
        return getPageResponseEntity(
                productCollectionService.readAll(pageable)
        );
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCollection(@RequestBody ProductCollectionDTO productCollection) {
        return create(productCollection);
    }

    @Override
    public ProductCollectionService getBaseService() {
        return productCollectionService;
    }

}
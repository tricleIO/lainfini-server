package application.rest;

import application.persistence.entity.ProductCollectionItem;
import application.rest.domain.ProductCollectionItemDTO;
import application.service.productCollectionItem.ProductCollectionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/collections")
public class ProductCollectionItemController extends AbstractDatabaseController<ProductCollectionItem, Integer, ProductCollectionItemDTO, ProductCollectionItemService> {

    @Autowired
    private ProductCollectionItemService productCollectionItemService;

    @RequestMapping(value = "/{collectionId}/items", method = RequestMethod.POST)
    public ResponseEntity<?> createCollection(@PathVariable Integer collectionId, @RequestBody ProductCollectionItemDTO productCollectionItem) {
        productCollectionItem.setCollectionUid(collectionId);
        return create(productCollectionItem);
    }

    @Override
    public ProductCollectionItemService getBaseService() {
        return productCollectionItemService;
    }

}
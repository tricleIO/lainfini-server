package application.service.productCollectionItem;

import application.persistence.entity.ProductCollectionItem;
import application.rest.domain.ProductCollectionItemDTO;
import application.service.BaseDatabaseService;

public interface ProductCollectionItemService extends BaseDatabaseService<ProductCollectionItem, Integer, ProductCollectionItemDTO> {

}

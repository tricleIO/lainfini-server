package application.service.productCollection;

import application.persistence.entity.ProductCollection;
import application.rest.domain.ProductCollectionDTO;
import application.service.BaseDatabaseService;

public interface ProductCollectionService extends BaseDatabaseService<ProductCollection, Integer, ProductCollectionDTO> {

}

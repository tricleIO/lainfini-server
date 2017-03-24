package application.service.productCollection;

import application.persistence.SlugService;
import application.persistence.entity.ProductCollection;
import application.rest.domain.ProductCollectionDTO;
import application.rest.domain.ProductDTO;
import application.service.BaseDatabaseService;

public interface ProductCollectionService extends BaseDatabaseService<ProductCollection, Integer, ProductCollectionDTO>, SlugService<ProductDTO> {

}

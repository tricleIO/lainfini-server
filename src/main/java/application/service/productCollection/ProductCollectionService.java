package application.service.productCollection;

import application.persistence.SlugService;
import application.persistence.entity.ProductCollection;
import application.persistence.repository.ProductCollectionRepository;
import application.rest.domain.ProductCollectionDTO;
import application.service.BaseDatabaseService;

public interface ProductCollectionService extends BaseDatabaseService<ProductCollection, Integer, ProductCollectionDTO>, SlugService<ProductCollection, ProductCollectionRepository, ProductCollectionDTO> {

}

package application.service.productCollection;

import application.persistence.entity.ProductCollection;
import application.persistence.repository.ProductCollectionRepository;
import application.rest.domain.ProductCollectionDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCollectionServiceImpl extends BaseDatabaseServiceImpl<ProductCollection, Integer, ProductCollectionRepository, ProductCollectionDTO> implements ProductCollectionService {

    @Autowired
    private ProductCollectionRepository productCollectionRepository;

    @Override
    public ProductCollectionRepository getRepository() {
        return productCollectionRepository;
    }

}

package application.service.productCollectionItem;

import application.persistence.entity.ProductCollectionItem;
import application.persistence.repository.ProductCollectionItemRepository;
import application.rest.domain.ProductCollectionItemDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.product.ProductService;
import application.service.productCollection.ProductCollectionService;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCollectionItemServiceImpl extends BaseDatabaseServiceImpl<ProductCollectionItem, Integer, ProductCollectionItemRepository, ProductCollectionItemDTO> implements ProductCollectionItemService {

    @Autowired
    private ProductCollectionItemRepository productCollectionItemRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductCollectionService productCollectionService;

    @Override
    protected AdditionalDataManipulatorBatch<ProductCollectionItemDTO> getAdditionalDataLoaderBatch(ProductCollectionItemDTO dto) {
        AdditionalDataManipulatorBatch<ProductCollectionItemDTO> batch = new AdditionalDataManipulatorBatch<>(dto);
        // add product
        batch.add(pci -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(pci.getProductUid(), productService::read),
                new AdditionalDataManipulator.Writer<>(pci::setProduct),
                ServiceResponseStatus.PRODUCT_NOT_FOUND)
        );
        // add product collection
        batch.add(pci -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(pci.getCollectionUid(), productCollectionService::read),
                new AdditionalDataManipulator.Writer<>(pci::setCollection),
                ServiceResponseStatus.COLLECTION_NOT_FOUND)
        );
        return batch;
    }

    @Override
    public ProductCollectionItemRepository getRepository() {
        return productCollectionItemRepository;
    }

}

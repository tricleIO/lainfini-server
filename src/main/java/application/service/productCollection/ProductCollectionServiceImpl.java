package application.service.productCollection;

import application.persistence.entity.ProductCollection;
import application.persistence.repository.ProductCollectionRepository;
import application.rest.domain.ProductCollectionDTO;
import application.rest.domain.ProductCollectionItemDTO;
import application.rest.domain.ProductDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCollectionServiceImpl extends BaseDatabaseServiceImpl<ProductCollection, Integer, ProductCollectionRepository, ProductCollectionDTO> implements ProductCollectionService {

    @Autowired
    private ProductCollectionRepository productCollectionRepository;

    @Autowired
    private ProductService productService;

    @Override
    protected void additionalUpdateDto(ProductCollectionDTO dto) {
        List<ProductCollectionItemDTO> items = dto.getItems();
        for (ProductCollectionItemDTO item : items) {
            ServiceResponse<ProductDTO> productResponse = productService.read(item.getProductUid());
            if (productResponse.isSuccessful()) {
                item.setProduct(productResponse.getBody());
            }
        }
        super.additionalUpdateDto(dto);
    }

    @Override
    public ProductCollectionRepository getRepository() {
        return productCollectionRepository;
    }

}

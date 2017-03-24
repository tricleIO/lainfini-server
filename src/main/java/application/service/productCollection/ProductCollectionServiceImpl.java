package application.service.productCollection;

import application.persistence.entity.ProductCollection;
import application.persistence.repository.ProductCollectionRepository;
import application.rest.domain.ProductCollectionDTO;
import application.rest.domain.ProductCollectionItemDTO;
import application.rest.domain.ProductDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.util.SlugMaker;
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
    protected ServiceResponse<ProductCollectionDTO> doBeforeConvertInCreate(ProductCollectionDTO dto) {
        // if url slug is null, generate it from name
        // @TODO - write some generic code (interface with repository and generic DTO) for this (product, material, this...)
        if (dto.getSlug() != null) {
            if (productCollectionRepository.countBySlug(dto.getSlug()) > 0) {
                return ServiceResponse.error(ServiceResponseStatus.SLUG_ALREADY_EXISTS);
            }
        } else {
            dto.setSlug(
                    SlugMaker.getSlugFromString(dto.getName(), productCollectionRepository)
            );
        }
        return super.doBeforeConvertInCreate(dto);
    }

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

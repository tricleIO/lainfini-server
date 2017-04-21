package application.service.stockItem;

import application.persistence.entity.StockItem;
import application.persistence.repository.StockItemRepository;
import application.persistence.type.StockItemStateEnum;
import application.rest.domain.StockItemDTO;
import application.rest.domain.UserDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class StockItemServiceImpl extends BaseDatabaseServiceImpl<StockItem, Long, StockItemRepository, StockItemDTO> implements StockItemService {

    @Autowired
    private StockItemRepository stockItemRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @Override
    protected ServiceResponse<StockItemDTO> doBeforeConvertInCreate(StockItemDTO dto) {
        dto.setAddedAt(new Date());
        dto.setState(StockItemStateEnum.STOCKED);
        ServiceResponse<UserDTO> userResponse = userService.readCurrentUser();
        if (!userResponse.isSuccessful()) {
            return ServiceResponse.error(userResponse.getStatus());
        }
        dto.setUser(userResponse.getBody());
        return super.doBeforeConvertInCreate(dto);
    }

    @Override
    protected AdditionalDataManipulatorBatch<StockItemDTO> getAdditionalDataLoaderBatch(StockItemDTO dto) {
        AdditionalDataManipulatorBatch<StockItemDTO> batch = new AdditionalDataManipulatorBatch<>(dto);
        // add product
        batch.add(si -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(si.getProductUid(), productService::read),
                new AdditionalDataManipulator.Writer<>(si::setProduct),
                ServiceResponseStatus.PRODUCT_NOT_FOUND
        ));
        return batch;
    }

    @Override
    public StockItemRepository getRepository() {
        return stockItemRepository;
    }

    @Override
    public ServiceResponse<Page<StockItemDTO>> readStockedItems(Pageable pageable) {
        Page<StockItem> stockItems = stockItemRepository.findByState(StockItemStateEnum.STOCKED, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(stockItems, pageable)
        );
    }

    @Override
    public ServiceResponse<Page<StockItemDTO>> readProductStockedItems(UUID productUid, Pageable pageable) {
        Page<StockItem> stockItems = stockItemRepository.findByProductIdAndState(productUid, StockItemStateEnum.STOCKED, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(stockItems, pageable)
        );
    }

    @Override
    public ServiceResponse<Long> countProductsInStock(UUID productUid) {
        return ServiceResponse.success(
                stockItemRepository.countByProductIdAndState(
                        productUid,
                        StockItemStateEnum.STOCKED
                )
        );
    }

    @Override
    public ServiceResponse<Long> countAllTimeStockedProducts(UUID productUid) {
        return ServiceResponse.success(
                stockItemRepository.countByProductId(
                        productUid
                )
        );
    }
}

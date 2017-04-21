package application.service.stockItem;

import application.persistence.entity.StockItem;
import application.persistence.repository.StockItemRepository;
import application.persistence.type.StockItemStateEnum;
import application.rest.domain.ProductDTO;
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
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
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
        // default timestamp
        dto.setAddedAt(new Date());
        // default state
        dto.setState(StockItemStateEnum.STOCKED);
        // current user
        ServiceResponse<UserDTO> userResponse = userService.readCurrentUser();
        if (!userResponse.isSuccessful()) {
            return ServiceResponse.error(userResponse.getStatus());
        }
        dto.setUser(userResponse.getBody());
        // product
        if (dto.getProductUid() == null) {
            return ServiceResponse.error(ServiceResponseStatus.PRODUCT_NOT_GIVEN);
        }
        ServiceResponse<ProductDTO> productResponse = productService.read(dto.getProductUid());
        if (!productResponse.isSuccessful()) {
            return ServiceResponse.error(ServiceResponseStatus.PRODUCT_NOT_FOUND);
        }
        ProductDTO productDTO = productResponse.getBody();
        if (productDTO.getSerialNumberIsRequired() && dto.getSerialNumber() == null) {
            return ServiceResponse.error(ServiceResponseStatus.SERIAL_NUMBER_REQUIRED_FOR_PRODUCT);
        }
        dto.setProduct(productDTO);
        return super.doBeforeConvertInCreate(dto);
    }

    @Override
    protected void doAfterConvertInCreate(StockItem entity) {
        super.doAfterConvertInCreate(entity);
    }

    @Override
    protected AdditionalDataManipulatorBatch<StockItemDTO> getAdditionalDataLoaderBatch(StockItemDTO dto) {
        AdditionalDataManipulatorBatch<StockItemDTO> batch = new AdditionalDataManipulatorBatch<>(dto);
        // add product
        if (dto.getProduct() == null) {
            batch.add(si -> new AdditionalDataManipulator<>(
                    new AdditionalDataManipulator.Reader<>(si.getProductUid(), productService::read),
                    new AdditionalDataManipulator.Writer<>(si::setProduct),
                    ServiceResponseStatus.PRODUCT_NOT_FOUND
            ));
        }
        return batch;
    }

    @Override
    public ServiceResponse<Page<StockItemDTO>> unstockProduct(UUID productId, int amount) {
        ServiceResponse<ProductDTO> productResponse = productService.read(productId);
        if (!productResponse.isSuccessful()) {
            return ServiceResponse.error(productResponse.getStatus());
        }
        if (productResponse.getBody().getSerialNumberIsRequired()) {
            return ServiceResponse.error(ServiceResponseStatus.SERIAL_NUMBER_REQUIRED_FOR_PRODUCT);
        }
        // unstock
        Pageable pageable = new PageRequest(0, amount);
        Page<StockItem> itemsToUnstock = stockItemRepository.findByProductIdAndState(productId, StockItemStateEnum.STOCKED, pageable);
        Page<StockItem> unstockedItems = unstockItems(pageable, itemsToUnstock);
        return ServiceResponse.success(convertPageWithEntitiesToPageWithDtos(unstockedItems, pageable));
    }

    private Page<StockItem> unstockItems(Pageable pageable, Page<StockItem> itemsToUnstock) {
        List<StockItem> unstockedItemsList = new LinkedList<>();
        for (StockItem item : itemsToUnstock) {
            unstockedItemsList.add(unstockItem(item));
        }
        return new PageImpl<>(unstockedItemsList, pageable, unstockedItemsList.size());
    }

    @Override
    public ServiceResponse<Page<StockItemDTO>> unstockProduct(UUID productId, int amount, List<String> serialNumbers) {
        if (amount != serialNumbers.size()) {
            return ServiceResponse.error(ServiceResponseStatus.AMOUNT_IS_NOT_EQUAL_TO_SERIAL_NUMBER_LIST_SIZE);
        }
        ServiceResponse<ProductDTO> productResponse = productService.read(productId);
        if (!productResponse.isSuccessful()) {
            return ServiceResponse.error(productResponse.getStatus());
        }
        Pageable pageable = new PageRequest(0, amount);
        Page<StockItem> itemsToUnstock = stockItemRepository.findByProductIdAndSerialNumberInAndState(
                productId,
                serialNumbers,
                StockItemStateEnum.STOCKED,
                pageable
        );
        Page<StockItem> unstockedItems = unstockItems(pageable, itemsToUnstock);
        return ServiceResponse.success(convertPageWithEntitiesToPageWithDtos(unstockedItems, pageable));
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

    @Override
    public StockItemRepository getRepository() {
        return stockItemRepository;
    }

    private StockItem unstockItem(StockItem itemToUnstock) {
        itemToUnstock.setState(StockItemStateEnum.SOLD);
        return stockItemRepository.save(itemToUnstock);
    }

}

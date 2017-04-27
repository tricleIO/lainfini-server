package application.service.stockItem;

import application.persistence.entity.CustomerOrder;
import application.persistence.entity.StockItem;
import application.persistence.repository.OrderRepository;
import application.persistence.repository.StockItemRepository;
import application.persistence.type.StockItemStateEnum;
import application.rest.domain.ProductDTO;
import application.rest.domain.StockItemDTO;
import application.rest.domain.UserDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.order.OrderService;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.stock.StockService;
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

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderService orderService;

    @Autowired
    private StockService stockService;

    @Override
    protected ServiceResponse<StockItemDTO> doBeforeConvertInCreate(StockItemDTO dto) {
        // default timestamp
        dto.setAddedAt(new Date());
        // default state
        dto.setState(StockItemStateEnum.AVAILABLE);
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
        batch.add(si -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(si.getOrderUid(), orderService::read),
                new AdditionalDataManipulator.Writer<>(si::setOrder),
                ServiceResponseStatus.ORDER_NOT_FOUND
        ));
        batch.add(si -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(si.getStockUid(), stockService::read),
                new AdditionalDataManipulator.Writer<>(si::setStock),
                ServiceResponseStatus.STOCK_NOT_FOUND
        ));
        return batch;
    }

    @Override
    public synchronized ServiceResponse<Page<StockItemDTO>> reserveProduct(UUID productId, int amount, UUID orderId) {
        // find product
        ServiceResponse<ProductDTO> productResponse = productService.read(productId);
        if (!productResponse.isSuccessful()) {
            return ServiceResponse.error(productResponse.getStatus());
        }
        // find order
        CustomerOrder order = orderRepository.findOne(orderId);
        if (order == null) {
            return ServiceResponse.error(ServiceResponseStatus.ORDER_NOT_FOUND);
        }
        // are there enough available items for product in stock?
        if (enoughAvailableItems(productId, amount)) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_ENOUGH_ITEMS_IN_STOCK);
        }
        // get requested amount of product
        Pageable requestedProductsPageable = getPageable(amount);
        Page<StockItem> itemsToReserve = stockItemRepository.findByProductIdAndStateOrderByStockPriority(
                productId,
                StockItemStateEnum.AVAILABLE,
                requestedProductsPageable
        );
        // reserve them for order
        Page<StockItem> reservedItems = reserveItems(
                itemsToReserve,
                order,
                requestedProductsPageable
        );
        // convert it to dto page
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(
                        reservedItems,
                        requestedProductsPageable
                )
        );
    }

    private PageRequest getPageable(int amount) {
        return new PageRequest(0, amount);
    }

    private boolean enoughAvailableItems(UUID productId, int amount) {
        return stockItemRepository.countByProductIdAndState(productId, StockItemStateEnum.AVAILABLE) < amount;
    }

    private Page<StockItem> reserveItems(Page<StockItem> itemsToReserve, CustomerOrder order, Pageable pageable) {
        List<StockItem> reservedItems = new LinkedList<>();
        for (StockItem item : itemsToReserve) {
            reservedItems.add(reserveItem(item, order));
        }
        return new PageImpl<>(reservedItems, pageable, reservedItems.size());
    }

    private StockItem reserveItem(StockItem itemToUnstock, CustomerOrder order) {
        itemToUnstock.setState(StockItemStateEnum.RESERVED);
        itemToUnstock.setOrder(order);
        return stockItemRepository.save(itemToUnstock);
    }

//    @Override
//    public ServiceResponse<Page<StockItemDTO>> reserveProduct(UUID productId, int amount, List<String> serialNumbers) {
//        if (amount != serialNumbers.size()) {
//            return ServiceResponse.error(ServiceResponseStatus.AMOUNT_IS_NOT_EQUAL_TO_SERIAL_NUMBER_LIST_SIZE);
//        }
//        ServiceResponse<ProductDTO> productResponse = productService.read(productId);
//        if (!productResponse.isSuccessful()) {
//            return ServiceResponse.error(productResponse.getStatus());
//        }
//        // unstock
//        if (stockItemRepository.countByProductIdAndSerialNumberInAndState(productId, serialNumbers, StockItemStateEnum.AVAILABLE) < amount) {
//            return ServiceResponse.error(ServiceResponseStatus.NOT_ENOUGH_ITEMS_IN_STOCK);
//        }
//        Pageable pageable = new PageRequest(0, amount);
//        Page<StockItem> itemsToUnstock = stockItemRepository.findByProductIdAndSerialNumberInAndState(
//                productId,
//                serialNumbers,
//                StockItemStateEnum.AVAILABLE,
//                pageable
//        );
//        Page<StockItem> unstockedItems = reserveItems(itemsToUnstock, pageable);
//        return ServiceResponse.success(convertPageWithEntitiesToPageWithDtos(unstockedItems, pageable));
//    }

    @Override
    public ServiceResponse<Page<StockItemDTO>> readStockedItems(Pageable pageable) {
        Page<StockItem> stockItems = stockItemRepository.findByState(StockItemStateEnum.AVAILABLE, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(stockItems, pageable)
        );
    }

    @Override
    public ServiceResponse<Page<StockItemDTO>> readProductStockedItems(UUID productUid, Pageable pageable) {
        Page<StockItem> stockItems = stockItemRepository.findByProductIdAndState(productUid, StockItemStateEnum.AVAILABLE, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(stockItems, pageable)
        );
    }

    @Override
    public ServiceResponse<Long> countProductsInStock(UUID productUid) {
        return ServiceResponse.success(
                stockItemRepository.countByProductIdAndState(
                        productUid,
                        StockItemStateEnum.AVAILABLE
                )
        );
    }

    @Override
    public ServiceResponse<Long> countAllTimeSoldItems(UUID productUid) {
        return ServiceResponse.success(
                stockItemRepository.countByProductIdAndState(
                        productUid,
                        StockItemStateEnum.SOLD
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

}

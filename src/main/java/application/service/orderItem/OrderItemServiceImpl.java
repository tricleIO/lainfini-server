package application.service.orderItem;

import application.persistence.entity.OrderItem;
import application.persistence.repository.OrderItemRepository;
import application.rest.domain.OrderItemDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.order.OrderService;
import application.service.product.ProductService;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl extends BaseDatabaseServiceImpl<OrderItem, Long, OrderItemRepository, OrderItemDTO> implements OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @Override
    protected AdditionalDataManipulatorBatch<OrderItemDTO> getCreateAdditionalDataLoaderBatch(OrderItemDTO orderItemDTO) {
        AdditionalDataManipulatorBatch<OrderItemDTO> batch = new AdditionalDataManipulatorBatch<>(orderItemDTO);
        // add product
        batch.add(oi -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(oi.getProductUid(), productService::read),
                new AdditionalDataManipulator.Writer<>(oi::setProduct),
                ServiceResponseStatus.PRODUCT_NOT_FOUND)
        );
        // add order
        batch.add(oi -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(oi.getOrderUid(), orderService::read),
                new AdditionalDataManipulator.Writer<>(oi::setOrder),
                ServiceResponseStatus.ORDER_NOT_FOUND)
        );
        return batch;
    }

    @Override
    public OrderItemRepository getRepository() {
        return orderItemRepository;
    }

}

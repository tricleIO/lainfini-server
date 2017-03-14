package application.service.order;

import application.persistence.entity.Order;
import application.rest.domain.OrderDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface OrderService extends BaseDatabaseService<Order, UUID, OrderDTO> {

    ServiceResponse<Page<OrderDTO>> readCustomerOrders(UUID customerId, Pageable pageable);

}

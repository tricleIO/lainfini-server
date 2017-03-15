package application.service.orderItem;

import application.persistence.entity.OrderItem;
import application.rest.domain.OrderItemDTO;
import application.service.BaseDatabaseService;

public interface OrderItemService extends BaseDatabaseService<OrderItem, Long, OrderItemDTO> {

}

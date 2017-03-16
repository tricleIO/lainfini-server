package application.rest;

import application.persistence.entity.OrderItem;
import application.rest.domain.OrderItemDTO;
import application.service.orderItem.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/orders")
public class OrderItemController extends AbstractDatabaseController<OrderItem, Long, OrderItemDTO, OrderItemService> {

    @Autowired
    private OrderItemService orderItemService;

    @RequestMapping(value = "/{orderId}/items", method = RequestMethod.POST)
    public ResponseEntity<?> createAddress(@PathVariable UUID orderId, @RequestBody OrderItemDTO orderItem) {
        orderItem.setOrderUid(orderId);
        return create(orderItem);
    }

    @Override
    public OrderItemService getBaseService() {
        return orderItemService;
    }

}
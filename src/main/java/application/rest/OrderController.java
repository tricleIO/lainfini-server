package application.rest;

import application.persistence.entity.CustomerOrder;
import application.rest.domain.CartDTO;
import application.rest.domain.OrderDTO;
import application.service.cart.CartService;
import application.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class OrderController extends AbstractDatabaseController<CustomerOrder, UUID, OrderDTO, OrderService> {

    @Autowired
    private OrderService orderService;

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public ResponseEntity<?> readOrders(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readOrder(@PathVariable UUID id) {
        return read(id);
    }

    @RequestMapping(value = "/customers/{customerId}/orders", method = RequestMethod.GET)
    public ResponseEntity<?> readCustomerOrders(@PathVariable UUID customerId, Pageable pageable) {
        return getPageResponseEntity(
                orderService.readCustomerOrders(customerId, pageable)
        );
    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public ResponseEntity<?> createOrder(@RequestBody OrderDTO order) {
        return create(order);
    }


    @RequestMapping(value = "/customers/{customerId}/orders", method = RequestMethod.POST)
    public ResponseEntity<?> createOrder(@PathVariable UUID customerId, @RequestBody OrderDTO order) {
        order.setCustomerUid(customerId);
        CartDTO cartDTO = cartService.read(order.getCartUid()).getBody();
        System.out.println(cartDTO);
        return create(order);
    }

    @Override
    public OrderService getBaseService() {
        return orderService;
    }

}
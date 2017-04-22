package application.rest;

import application.persistence.entity.CustomerOrder;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.OrderDTO;
import application.service.cart.CartService;
import application.service.order.OrderService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
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

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public ResponseEntity<?> readOrders(Pageable pageable) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return readAll(pageable);
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readOrder(@PathVariable UUID id) {
        // admins
        ServiceResponse<Boolean> isAdminResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // concrete customer of order
        ServiceResponse<OrderDTO> orderResponse = orderService.read(id);
        if (!orderResponse.isSuccessful()) {
            return new ErrorResponseEntity(orderResponse.getStatus());
        }
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(
                orderResponse.getBody().getCustomerUid()
        );
        // final evaluation
        if (!isAdminResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(isCurrentUserResponse.getStatus());
        }
        return read(id);
    }

    @RequestMapping(value = "/orders/{id}/ship", method = RequestMethod.POST)
    public ResponseEntity<?> shipOrder(@PathVariable UUID id) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return getSimpleResponseEntity(
                orderService.shipOrder(id)
        );
    }

    @RequestMapping(value = "/customers/{customerId}/orders", method = RequestMethod.GET)
    public ResponseEntity<?> readCustomerOrders(@PathVariable UUID customerId, Pageable pageable) {
        // admins
        ServiceResponse<Boolean> isAdminResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(
                customerId
        );
        // final evaluation
        if (!isAdminResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(isCurrentUserResponse.getStatus());
        }
        return getPageResponseEntity(
                orderService.readCustomerOrders(customerId, pageable)
        );
    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public ResponseEntity<?> createOrder(@RequestBody OrderDTO order) {
        return create(order);
    }


//    @RequestMapping(value = "/customers/{customerId}/orders", method = RequestMethod.POST)
//    public ResponseEntity<?> createOrder(@PathVariable UUID customerId, @RequestBody OrderDTO order) {
//        // admins
//        ServiceResponse<Boolean> isAdminResponse = userService.hasCurrentUserDemandedRoles(
//                UserRoleEnum.ROLE_ADMIN
//        );
//        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(
//                customerId
//        );
//        // final evaluation
//        if (!isAdminResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
//            return new ErrorResponseEntity(isCurrentUserResponse.getStatus());
//        }
//        order.setCustomerUid(customerId);
//        CartDTO cartDTO = cartService.read(order.getCartUid()).getBody();
//        System.out.println(cartDTO);
//        return create(order);
//    }

    @Override
    public OrderService getBaseService() {
        return orderService;
    }

}
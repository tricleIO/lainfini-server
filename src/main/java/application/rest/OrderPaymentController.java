package application.rest;

import application.persistence.entity.Payment;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.OrderDTO;
import application.rest.domain.PaymentDTO;
import application.service.order.OrderService;
import application.service.payment.PaymentService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrderPaymentController extends AbstractDatabaseController<Payment, Long, PaymentDTO, PaymentService> {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orders/{orderId}/payments", method = RequestMethod.GET)
    public ResponseEntity<?> readPayments(@PathVariable UUID orderId, Pageable pageable) {
        // admins
        ServiceResponse<Boolean> isAdminResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // concrete customer of order
        ServiceResponse<OrderDTO> orderResponse = orderService.read(orderId);
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
        return getPageResponseEntity(
                paymentService.readOrderPayments(orderId, pageable)
        );
    }

    @Override
    public PaymentService getBaseService() {
        return paymentService;
    }

}
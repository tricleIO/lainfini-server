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
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController extends AbstractDatabaseController<Payment, Long, PaymentDTO, PaymentService> {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readPayments(Pageable pageable) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readPayment(@PathVariable Long id) {
        ServiceResponse<PaymentDTO> paymentResponse = paymentService.read(id);
        // admins
        ServiceResponse<Boolean> isAdminResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // concrete customer of order
        ServiceResponse<OrderDTO> orderResponse = orderService.read(
                paymentResponse.getBody().getOrderUid()
        );
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
        return getSimpleResponseEntity(paymentResponse);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createPayment(@RequestBody PaymentDTO paymentDTO) {
        return create(paymentDTO);
    }

    @Override
    public PaymentService getBaseService() {
        return paymentService;
    }

}
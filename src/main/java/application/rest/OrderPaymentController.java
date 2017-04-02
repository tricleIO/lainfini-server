package application.rest;

import application.persistence.entity.Payment;
import application.rest.domain.PaymentDTO;
import application.service.payment.PaymentService;
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

    @RequestMapping(value = "orders/{orderId}/payments", method = RequestMethod.GET)
    public ResponseEntity<?> readPayments(@PathVariable UUID orderId, Pageable pageable) {
        return getPageResponseEntity(
                paymentService.readOrderPayments(orderId, pageable)
        );
    }

    @Override
    public PaymentService getBaseService() {
        return paymentService;
    }

}
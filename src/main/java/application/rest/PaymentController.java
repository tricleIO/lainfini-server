package application.rest;

import application.persistence.entity.Payment;
import application.rest.domain.PaymentDTO;
import application.service.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController extends AbstractDatabaseController<Payment, Long, PaymentDTO, PaymentService> {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readPayments(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readPayment(@PathVariable Long id) {
        return read(id);
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
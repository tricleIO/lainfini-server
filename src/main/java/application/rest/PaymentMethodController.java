package application.rest;

import application.persistence.type.PaymentMethodEnum;
import application.rest.domain.PaymentMethodDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(value = "/payments/methods")
public class PaymentMethodController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readPaymentMethods() {
        List<PaymentMethodDTO> paymentMethodDTOList = new LinkedList<>();
        for (PaymentMethodEnum payment : PaymentMethodEnum.values()) {
            paymentMethodDTOList.add(payment.toDTO(false));
        }
        return new ResponseEntity<>(paymentMethodDTOList, HttpStatus.OK);
    }

}
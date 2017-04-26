package application.rest;

import application.persistence.type.PaymentMethodEnum;
import application.rest.domain.PaymentMethodDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(value = "/payments/methods")
public class PaymentMethodController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readPaymentMethods(@RequestParam(required = false) Integer hidden) {
        List<PaymentMethodDTO> paymentMethodDTOList = new LinkedList<>();
        for (PaymentMethodEnum payment : PaymentMethodEnum.values()) {
            if (payment.getState() == PaymentMethodEnum.State.ALLOWED
                    || ((payment.getState() == PaymentMethodEnum.State.HIDDEN) && hidden != null && hidden == 1)) {
                paymentMethodDTOList.add(payment.toDTO(false));
            }
        }
        return new ResponseEntity<>(paymentMethodDTOList, HttpStatus.OK);
    }

}
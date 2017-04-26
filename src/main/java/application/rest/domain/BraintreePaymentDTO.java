package application.rest.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class BraintreePaymentDTO {

    private String paymentMethodNonce;
    private UUID orderUid;

}

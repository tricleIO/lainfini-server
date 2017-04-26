package application.rest.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class PaymentInformationDTO implements Serializable {

    private String cardNumber;
    private Integer monthExpiration;
    private Integer yearExpiration;
    private String cvc;
    private Integer amount;
    private String currency;
    private String paymentDescription;
    private UUID orderUid;

}
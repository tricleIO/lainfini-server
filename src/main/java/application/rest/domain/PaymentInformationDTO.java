package application.rest.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by pfilip on 15.3.17.
 */
@Data
public class PaymentInformationDTO implements Serializable {
    private String cardNumber;
    private Integer monthExpiration;
    private Integer yearExpiration;
    private String cvc;
    private Integer amount;
    private String currency;
    private String paymentDescription;
    //todo order
}
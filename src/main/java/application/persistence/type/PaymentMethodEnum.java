package application.persistence.type;

import application.persistence.DTOConvertable;
import application.rest.domain.PaymentMethodDTO;

public enum PaymentMethodEnum implements DTOConvertable<PaymentMethodDTO> {

    PAYPAL("www.paypal.com/payments"),
    APPLE_PAY("www.apple-pay.com/payPay"),
    STRIPE("www.stripe.org");

    private String link;

    PaymentMethodEnum(String link) {
        this.link = link;
    }

    public PaymentMethodDTO toDTO(boolean selectAsParent, Object... parentParams) {
        PaymentMethodDTO paymentMethodDTO = new PaymentMethodDTO();
        paymentMethodDTO.setValue(this.name());
        paymentMethodDTO.setLink(this.link);
        return paymentMethodDTO;
    }

}

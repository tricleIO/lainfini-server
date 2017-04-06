package application.persistence.type;

import application.persistence.DTOConvertable;
import application.rest.domain.PaymentMethodDTO;

public enum PaymentMethodEnum implements DTOConvertable<PaymentMethodDTO> {

    PAYPAL("www.paypal.com/payments", State.DENIED),
    APPLE_PAY("www.apple-pay.com/payPay", State.DENIED),
    STRIPE("www.stripe.org", State.ALLOWED);

    private String link;
    private State state;

    PaymentMethodEnum(String link, State state) {
        this.link = link;
        this.state = state;
    }

    public PaymentMethodDTO toDTO(boolean selectAsParent, Object... parentParams) {
        PaymentMethodDTO paymentMethodDTO = new PaymentMethodDTO();
        paymentMethodDTO.setValue(this.name());
        paymentMethodDTO.setLink(this.link);
        return paymentMethodDTO;
    }

    public String getLink() {
        return link;
    }

    public State getState() {
        return state;
    }

    public enum State {
        ALLOWED,
        HIDDEN,
        DENIED;
    }

}

package application.persistence.type;

import application.persistence.DTOConvertable;
import application.rest.domain.PaymentMethodDTO;

public enum PaymentMethodEnum implements DTOConvertable<PaymentMethodDTO> {

    PAYPAL("/payments/braintree/paypal", State.ALLOWED),
    APPLE_PAY("/payments/braintree/applePay", State.ALLOWED),
    CARD("/payments/braintree/card", State.ALLOWED),
    STRIPE("/payments/stripe", State.HIDDEN);

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

package application.rest.domain;

import application.persistence.entity.Payment;
import application.persistence.type.PaymentMethodEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
public class PaymentDTO implements ReadWriteDatabaseDTO<Payment>, IdentifableDTO<Long> {

    private Long uid;
    private String referenceCode;
    private PaymentMethodEnum paymentMethod;
    private Date madeAt;
    private BigDecimal amount;
    private Integer currencyUid;
    private UUID orderUid;
    private String abraLink;

    private CurrencyDTO currency;
    private OrderDTO order;

    @Override
    public Payment toEntity(boolean selectAsParent, Object... parentParams) {
        Payment payment = new Payment();
        payment.setId(uid);
        payment.setReferenceCode(referenceCode);
        payment.setPaymentMethod(paymentMethod);
        payment.setMadeAt(madeAt);
        payment.setAmount(amount);
        payment.setAbraLink(abraLink);
        if (selectAsParent) {
            if (currency != null) {
                payment.setCurrency(currency.toEntity(false));
            }
            if (order != null) {
                payment.setOrder(order.toEntity(false));
            }
        }
        return payment;
    }

}

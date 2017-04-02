package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.PaymentMethodEnum;
import application.rest.domain.PaymentDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Payment implements DTOConvertable<PaymentDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String referenceCode;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMethodEnum paymentMethod;

    private Date madeAt;

    private Double amount;

    @ManyToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private CustomerOrder order;

    private String abraLink;

    @Override
    public PaymentDTO toDTO(boolean selectAsParent, Object... parentParams) {
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setUid(id);
        paymentDTO.setReferenceCode(referenceCode);
        paymentDTO.setPaymentMethod(paymentMethod);
        paymentDTO.setMadeAt(madeAt);
        paymentDTO.setAmount(amount);
        if (order != null) {
            paymentDTO.setOrderUid(order.getId());
        }
        if (selectAsParent) {
            if (currency != null) {
                paymentDTO.setCurrency(currency.toDTO(false));
            }
        }
        paymentDTO.setAbraLink(abraLink);
        return paymentDTO;
    }
}

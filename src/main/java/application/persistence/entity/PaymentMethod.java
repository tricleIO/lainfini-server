package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.PaymentMethodDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class PaymentMethod implements DTOConvertable<PaymentMethodDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Override
    public PaymentMethodDTO toDTO(boolean selectAsParent, Object... parentParams) {
        PaymentMethodDTO paymentMethodDTO = new PaymentMethodDTO();
        paymentMethodDTO.setUid(id);
        paymentMethodDTO.setName(name);
        return paymentMethodDTO;
    }

}

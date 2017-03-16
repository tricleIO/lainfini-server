package application.rest.domain;

import application.persistence.entity.PaymentMethod;
import lombok.Data;

@Data
public class PaymentMethodDTO implements ReadWriteDatabaseDTO<PaymentMethod>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;

    @Override
    public PaymentMethod toEntity(boolean selectAsParent, Object... parentParams) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setId(uid);
        paymentMethod.setName(name);
        return paymentMethod;
    }

}

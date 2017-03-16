package application.service.paymentMethod;

import application.persistence.entity.PaymentMethod;
import application.rest.domain.PaymentMethodDTO;
import application.service.BaseDatabaseService;

public interface PaymentMethodService extends BaseDatabaseService<PaymentMethod, Integer, PaymentMethodDTO> {

}

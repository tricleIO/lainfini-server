package application.service.payment;

import application.persistence.entity.Payment;
import application.rest.domain.PaymentDTO;
import application.service.BaseDatabaseService;

public interface PaymentService extends BaseDatabaseService<Payment, Long, PaymentDTO> {

}

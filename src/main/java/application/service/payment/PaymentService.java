package application.service.payment;

import application.persistence.entity.Payment;
import application.rest.domain.PaymentDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface PaymentService extends BaseDatabaseService<Payment, Long, PaymentDTO> {

    ServiceResponse<Page<PaymentDTO>> readOrderPayments(UUID orderId, Pageable pageable);

}

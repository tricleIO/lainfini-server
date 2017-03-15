package application.service.paymentMethod;

import application.persistence.entity.PaymentMethod;
import application.persistence.repository.PaymentMethodRepository;
import application.rest.domain.PaymentMethodDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentMethodServiceImpl extends BaseDatabaseServiceImpl<PaymentMethod, Integer, PaymentMethodRepository, PaymentMethodDTO> implements PaymentMethodService {

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Override
    public PaymentMethodRepository getRepository() {
        return paymentMethodRepository;
    }

}

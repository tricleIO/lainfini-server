package application.service.payment;

import application.persistence.entity.Currency;
import application.persistence.entity.Payment;
import application.persistence.repository.CurrencyRepository;
import application.persistence.repository.PaymentRepository;
import application.rest.domain.PaymentDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.order.OrderService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends BaseDatabaseServiceImpl<Payment, Long, PaymentRepository, PaymentDTO> implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderService orderService;

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    protected ServiceResponse<PaymentDTO> doBeforeConvertInCreate(PaymentDTO dto) {
        Currency currency = currencyRepository.findOne(dto.getCurrencyUid());
        if (currency == null) {
            return ServiceResponse.error(ServiceResponseStatus.CURRENCY_NOT_FOUND);
        }
        dto.setCurrency(currency.toDTO(false));
        return super.doBeforeConvertInCreate(dto);
    }

    @Override
    protected AdditionalDataManipulatorBatch<PaymentDTO> getAdditionalDataLoaderBatch(PaymentDTO dto) {
        AdditionalDataManipulatorBatch<PaymentDTO> batch = super.getAdditionalDataLoaderBatch(dto);
        batch.add(p -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(p.getOrderUid(), orderService::read),
                new AdditionalDataManipulator.Writer<>(p::setOrder),
                ServiceResponseStatus.ORDER_NOT_FOUND
        ));
        return batch;
    }

    @Override
    public PaymentRepository getRepository() {
        return paymentRepository;
    }

}

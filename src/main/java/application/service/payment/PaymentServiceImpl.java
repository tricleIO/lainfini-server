package application.service.payment;

import application.configuration.AppProperties;
import application.persistence.entity.Currency;
import application.persistence.entity.Payment;
import application.persistence.repository.CurrencyRepository;
import application.persistence.repository.PaymentRepository;
import application.persistence.type.PaymentMethodEnum;
import application.persistence.type.PaymentStateEnum;
import application.rest.domain.MailDTO;
import application.rest.domain.OrderDTO;
import application.rest.domain.PaymentDTO;
import application.rest.domain.UserDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.mail.MailService;
import application.service.order.OrderService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl extends BaseDatabaseServiceImpl<Payment, Long, PaymentRepository, PaymentDTO> implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Autowired
    private CurrencyRepository currencyRepository;

    @Autowired
    private MailService mailService;

    @Autowired
    private AppProperties appProperties;

    @Override
    public ServiceResponse<PaymentDTO> create(PaymentDTO dto) {
        ServiceResponse<PaymentDTO> createPaymentResponse = super.create(dto);
        if (dto.getOrderUid() != null) {
            ServiceResponse<OrderDTO> readOrderResponse = orderService.read(dto.getOrderUid());
            if (readOrderResponse.isSuccessful()) {
                OrderDTO orderDTO = readOrderResponse.getBody();
                if (orderDTO.getPaymentState() == PaymentStateEnum.PAID) {
                    ServiceResponse<UserDTO> readUserResponse = userService.read(readOrderResponse.getBody().getCustomerUid());
                    if (readUserResponse.isSuccessful()) {
                        MailDTO mailDTO = new MailDTO();
                        mailDTO.setTo(readUserResponse.getBody().getEmail());
                        mailDTO.setSubject("Order payment accepted");
                        mailDTO.setText("<h2>Greetings from Atelier LAINFINI!</h2>" +
                                "<p>We are happy to announce we successfully got your payment for order <b>" + orderDTO.getUid() + "</b><br>" +
                                "Thank you for your shopping in Atelier LAINFINI!</p>");
                        mailService.sendMail(mailDTO);
                    }
                    for (String sellerEmail : appProperties.getSellerEmails()) {
                        MailDTO mailDTO = new MailDTO();
                        mailDTO.setTo(sellerEmail);
                        mailDTO.setSubject("Order payment accepted");
                        mailDTO.setText("<h2>Customer payment accepted</h2>" +
                                "<p>Payment for order <b>" + orderDTO.getUid() + "</b> accepted.");
                        mailService.sendMail(mailDTO);
                    }
                }
            }
        }
        return createPaymentResponse;
    }

    @Override
    public ServiceResponse<Page<PaymentDTO>> readOrderPayments(UUID orderId, Pageable pageable) {
        Page<Payment> payments = paymentRepository.findByOrderId(orderId, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(payments, pageable)
        );
    }

    @Override
    protected ServiceResponse<PaymentDTO> doBeforeConvertInCreate(PaymentDTO dto) {
        if (dto.getPaymentMethod().getState() == PaymentMethodEnum.State.DENIED) {
            return ServiceResponse.error(ServiceResponseStatus.PAYMENT_METHOD_FORBIDDEN);
        }
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

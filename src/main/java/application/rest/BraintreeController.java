package application.rest;

import application.configuration.AppProperties;
import application.persistence.type.PaymentMethodEnum;
import application.persistence.type.PaymentStateEnum;
import application.rest.domain.*;
import application.service.mail.MailService;
import application.service.order.OrderService;
import application.service.payment.PaymentService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import application.util.HtmlGenerator;
import com.braintreegateway.*;
import com.braintreegateway.Transaction.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.context.Context;

import java.util.Arrays;
import java.util.Locale;

@RestController
@RequestMapping(value = "/payments")
public class BraintreeController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private MailService mailService;

    @Autowired
    private HtmlGenerator htmlGenerator;

    private Status[] TRANSACTION_SUCCESS_STATUSES = new Status[]{
            Transaction.Status.AUTHORIZED,
            Transaction.Status.AUTHORIZING,
            Transaction.Status.SETTLED,
            Transaction.Status.SETTLEMENT_CONFIRMED,
            Transaction.Status.SETTLEMENT_PENDING,
            Transaction.Status.SETTLING,
            Transaction.Status.SUBMITTED_FOR_SETTLEMENT
    };

    @ResponseBody
    @RequestMapping(value = "/braintree/token", method = RequestMethod.POST)
    public ResponseEntity<?> getClientToken() {
        return new ResponseEntity<>(
                new BraintreeClientToken(getGateway().clientToken().generate()),
                HttpStatus.OK
        );
    }

    @ResponseBody
    @RequestMapping(value = "/braintree/applePay", method = RequestMethod.POST)
    public ResponseEntity<?> createApplePayPayment(@RequestBody BraintreePaymentDTO braintreePaymentDTO) {
        return createBraintreePayment(braintreePaymentDTO, PaymentMethodEnum.APPLE_PAY);
    }

    @ResponseBody
    @RequestMapping(value = "/braintree/paypal", method = RequestMethod.POST)
    public ResponseEntity<?> createPayPalPayment(@RequestBody BraintreePaymentDTO braintreePaymentDTO) {
        return createBraintreePayment(braintreePaymentDTO, PaymentMethodEnum.PAYPAL);
    }

    @ResponseBody
    @RequestMapping(value = "/braintree/card", method = RequestMethod.POST)
    public ResponseEntity<?> createPayment(@RequestBody BraintreePaymentDTO braintreePaymentDTO) {
        return createBraintreePayment(braintreePaymentDTO, PaymentMethodEnum.CARD);
    }

    public ResponseEntity<?> createBraintreePayment(BraintreePaymentDTO braintreePaymentDTO, PaymentMethodEnum paymentMethodValue) {
        if (paymentMethodValue.getState() == PaymentMethodEnum.State.DENIED) {
            return new ErrorResponseEntity(ServiceResponseStatus.PAYMENT_METHOD_FORBIDDEN);
        }

        // order exists
        ServiceResponse<OrderDTO> orderResponse = orderService.read(braintreePaymentDTO.getOrderUid());
        if (!orderResponse.isSuccessful()) {
            return new ErrorResponseEntity(ServiceResponseStatus.ORDER_NOT_FOUND);
        }

        OrderDTO orderDTO = orderResponse.getBody();

        if (orderDTO.getPaymentState() == PaymentStateEnum.PAID) {
            return new ErrorResponseEntity(ServiceResponseStatus.ORDER_ALREADY_PAID);
        }

        // do transaction
        TransactionRequest request = new TransactionRequest()
                .amount(orderDTO.getTotalPriceWithShipping())
                .paymentMethodNonce(braintreePaymentDTO.getPaymentMethodNonce())
                .options()
                .submitForSettlement(true)
                .done();
        Result<Transaction> result = getGateway().transaction().sale(request);

        // result of transaction
        if (result.isSuccess()) {
            // success status
            if (Arrays.stream(TRANSACTION_SUCCESS_STATUSES).anyMatch(s -> s == result.getTarget().getStatus())) {
                // prepare internal payment
                PaymentDTO paymentDTO = new PaymentDTO();
                paymentDTO.setCurrencyUid(2);
                paymentDTO.setOrderUid(orderDTO.getUid());
                paymentDTO.setAmount(result.getTarget().getAmount());
                paymentDTO.setPaymentMethod(paymentMethodValue);
                paymentDTO.setReferenceCode(result.getTarget().getId());

                // and create it
                ServiceResponse<PaymentDTO> createPaymentResponse = paymentService.create(paymentDTO);

                // problems with creating payment internally
                if (!createPaymentResponse.isSuccessful()) {
                    return new ErrorResponseEntity(createPaymentResponse.getStatus());
                }

                // everything is ok
                return new ResponseEntity<>(createPaymentResponse.getBody(), HttpStatus.OK);
            } else {
                // not success status
                new Thread(() -> sendPaymentNotSuccessfulEmail(orderDTO)).start();
                return new ErrorResponseEntity(ServiceResponseStatus.PAYMENT_UNSUCCESSFUL);
            }
        } else {
            // not success
            // payment error status
            ServiceResponseStatus paymentUnsuccessfulStatus = ServiceResponseStatus.PAYMENT_UNSUCCESSFUL;
            // send error mail
            new Thread(() -> sendPaymentNotSuccessfulEmail(orderDTO)).start();
            // try to find concrete error
            for (ValidationError error : result.getErrors().getAllDeepValidationErrors()) {
                return new ResponseEntity<>(
                        getStatusDTO(error, paymentUnsuccessfulStatus),
                        paymentUnsuccessfulStatus.getHttpStatus()
                );
            }
            // generic payment error
            return new ErrorResponseEntity(paymentUnsuccessfulStatus);
        }
    }

    public StatusDTO getStatusDTO(ValidationError error, ServiceResponseStatus paymentUnsuccessfulStatus) {
        StatusDTO errorStatus = new StatusDTO();
        errorStatus.setStatus(paymentUnsuccessfulStatus.getMessage());
        errorStatus.setMessage(error.getMessage());
        try {
            errorStatus.setCode(Integer.parseInt(error.getCode().code));
        } catch (Exception exception) {
            errorStatus.setCode(paymentUnsuccessfulStatus.getHttpStatus().value());
        }
        return errorStatus;
    }

    public void sendPaymentNotSuccessfulEmail(OrderDTO orderDTO) {
        ServiceResponse<UserDTO> userResponse = userService.read(orderDTO.getCustomerUid());
        if (userResponse.isSuccessful()) {
            MailDTO mailDTO = new MailDTO();
            mailDTO.setTo(userResponse.getBody().getEmail());
            mailDTO.setSubject("Unsuccessful payment");
            // html
            final Context context = new Context(Locale.ENGLISH);
            context.setVariable("order", orderDTO);
            mailDTO.setText(htmlGenerator.generateHtml("templates/emails/payment/payment_not_accepted.html", context));
            // send
            mailService.sendMail(mailDTO);
        }
    }

    private BraintreeGateway getGateway() {
        return new BraintreeGateway(
                Environment.parseEnvironment(appProperties.getBraintreeEnvironment()),
                appProperties.getBraintreeMerchantId(),
                appProperties.getBraintreePublicKey(),
                appProperties.getBraintreePrivateKey()
        );
    }
}

package application.rest;

import application.configuration.AppProperties;
import application.persistence.type.PaymentMethodEnum;
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

import java.math.BigDecimal;
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
                new BraintreeClientToken(gateway.clientToken().generate()),
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

    public ResponseEntity<?> createBraintreePayment(@RequestBody BraintreePaymentDTO braintreePaymentDTO, PaymentMethodEnum paymentMethodValue) {
        if (paymentMethodValue.getState() == PaymentMethodEnum.State.DENIED) {
            return new ErrorResponseEntity(ServiceResponseStatus.PAYMENT_METHOD_FORBIDDEN);
        }
        ServiceResponse<OrderDTO> orderResponse = orderService.read(braintreePaymentDTO.getOrderUid());
        if (!orderResponse.isSuccessful()) {
            return new ErrorResponseEntity(ServiceResponseStatus.ORDER_NOT_FOUND);
        }
        OrderDTO orderDTO = orderResponse.getBody();
        TransactionRequest request = new TransactionRequest()
                .amount(new BigDecimal(orderDTO.getTotalPriceWithShipping()))
                .paymentMethodNonce(braintreePaymentDTO.getPaymentMethodNonce())
                .options()
                .submitForSettlement(true)
                .done();
        Result<Transaction> result = gateway.transaction().sale(request);
        if (!result.isSuccess()) {
            sendPaymentNotSuccessfulEmail(orderDTO);
            return new ErrorResponseEntity(ServiceResponseStatus.PAYMENT_UNSUCCESSFUL);
        } else {
            if (Arrays.stream(TRANSACTION_SUCCESS_STATUSES).anyMatch(s -> s == result.getTarget().getStatus())) {
                PaymentDTO paymentDTO = new PaymentDTO();
                paymentDTO.setCurrencyUid(2);
                paymentDTO.setOrderUid(orderDTO.getUid());
                paymentDTO.setAmount(result.getTarget().getAmount().doubleValue());
                paymentDTO.setPaymentMethod(paymentMethodValue);
                paymentDTO.setReferenceCode(result.getTarget().getId());
                ServiceResponse<PaymentDTO> createPaymentResponse = paymentService.create(paymentDTO);
                if (!createPaymentResponse.isSuccessful()) {
                    return new ErrorResponseEntity(createPaymentResponse.getStatus());
                }
                return new ResponseEntity<>(createPaymentResponse.getBody(), HttpStatus.OK);
            } else {
                sendPaymentNotSuccessfulEmail(orderDTO);
            }
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
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

    private static BraintreeGateway gateway = new BraintreeGateway(
            Environment.SANDBOX,
            "j23qymyj5mxyx29t",
            "bpn69z7wnhgn4zz9",
            "3cb85613eaadd5c93e78a77188afff57"
    );

}

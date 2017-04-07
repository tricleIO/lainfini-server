package application.rest;

import application.configuration.AppProperties;
import application.persistence.entity.User;
import application.persistence.type.PaymentMethodEnum;
import application.rest.domain.*;
import application.service.mail.MailService;
import application.service.order.OrderService;
import application.service.payment.PaymentService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.security.CustomUserDetails;
import application.service.user.UserService;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.model.ExternalAccountCollection;
import com.stripe.model.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pfilip on 5.3.17.
 */
@RestController
@RequestMapping(value = "/payments")
public class StripeController {

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

    @ResponseBody
    @RequestMapping(value = "/stripe", method = RequestMethod.POST)
    public ResponseEntity<?> createPayment(@RequestBody PaymentInformationDTO paymentInformation) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if (PaymentMethodEnum.STRIPE.getState() == PaymentMethodEnum.State.DENIED) {
            return new ErrorResponseEntity(ServiceResponseStatus.PAYMENT_METHOD_FORBIDDEN);
        }
        Stripe.apiKey = appProperties.getStripeSecretKey();

        if (paymentInformation.getOrderUid() == null) {
            return new ErrorResponseEntity(ServiceResponseStatus.ORDER_NOT_FOUND);
        }
        ServiceResponse<OrderDTO> orderResponse = orderService.read(paymentInformation.getOrderUid());
        if (!orderResponse.isSuccessful()) {
            return new ErrorResponseEntity(orderResponse.getStatus());
        }

        User user = null;
        Customer customer = null;

        OrderDTO orderDTO = orderResponse.getBody();

        final double wholePriceWithShipping = orderDTO.getTotalPriceWithShipping();
        final int amountForStripe = (int) Math.ceil(wholePriceWithShipping * 100);
        paymentInformation.setAmount(amountForStripe);
        paymentInformation.setCurrency("usd");

        if (paymentInformation.getCardNumber() == null ||
                paymentInformation.getMonthExpiration() == null ||
                paymentInformation.getYearExpiration() == null ||
                paymentInformation.getCvc() == null ||
                paymentInformation.getAmount() == null ||
                paymentInformation.getCurrency() == null) {
            return ResponseEntity.unprocessableEntity().body("Missing payment information");
        }

        user = CustomUserDetails.getCurrentUser();

        //create new customer token
        if (user != null && user.getStripeToken() != null) {
            customer = getCustomer(user.getStripeToken());
        }

        try {
            if (customer == null) {
                customer = createCustomer((user != null) ? user.getEmail() : null, paymentInformation.getCardNumber(), paymentInformation.getMonthExpiration(), paymentInformation.getYearExpiration(), paymentInformation.getCvc());
                if (user != null) {
                    user.setStripeToken(customer.getId());
                    userService.patch(user.toDTO(true));
                }
            }
        } catch (Exception ex) {
            sendPaymentNotSuccessfulEmail(orderDTO);
            throw ex;
        }

        ResponseEntity<?> chargeResponse = chargeCustomer(
                paymentInformation.getAmount(), paymentInformation.getCurrency(), paymentInformation.getPaymentDescription(), customer
        );
        if (chargeResponse.getStatusCode() == HttpStatus.OK) {
            Charge charge = (Charge) chargeResponse.getBody();
            if (charge.getPaid()) {
                PaymentDTO paymentDTO = new PaymentDTO();
                paymentDTO.setCurrencyUid(2);
                paymentDTO.setOrderUid(orderDTO.getUid());
                paymentDTO.setAmount(charge.getAmount() / (double) 100);
                paymentDTO.setPaymentMethod(PaymentMethodEnum.STRIPE);
                paymentDTO.setReferenceCode(charge.getId());
                ServiceResponse<PaymentDTO> createPaymentResponse = paymentService.create(paymentDTO);
                if (!createPaymentResponse.isSuccessful()) {
                    return new ErrorResponseEntity(createPaymentResponse.getStatus());
                }
                return new ResponseEntity<>(createPaymentResponse.getBody(), HttpStatus.OK);
            } else {
                sendPaymentNotSuccessfulEmail(orderDTO);
            }
        } else {
            sendPaymentNotSuccessfulEmail(orderDTO);
        }
        return chargeResponse;
    }

    public void sendPaymentNotSuccessfulEmail(OrderDTO orderDTO) {
        ServiceResponse<UserDTO> userResponse = userService.read(orderDTO.getCustomerUid());
        if (userResponse.isSuccessful()) {
            MailDTO mailDTO = new MailDTO();
            mailDTO.setTo(userResponse.getBody().getEmail());
            mailDTO.setSubject("Unsuccessful payment");
            mailDTO.setText("<p>Dear Customer,<br><br>" +
                    "Unfortunately, we have been unable to process the payment for your shopping (order " + orderDTO.getUid() + ") in Atelier LAINFINI.<br>" +
                    "Please try again.<br>" +
                    "Thank you for your shopping in Atelier LAINFINI!</p>");
            mailService.sendMail(mailDTO);
        }
    }

    private ResponseEntity<?> chargeCustomer(Integer amount, String currency, String paymentDescription, Customer customer) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        if (customer != null) {
            Charge charge1 = createCharge(customer.getId(), amount, currency, paymentDescription);

            return ResponseEntity.ok(charge1);
        } else {
            return ResponseEntity.badRequest().body("");
        }
    }


    private Charge createCharge(String source, Integer amount, String currency, String description) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("amount", amount);
        params.put("currency", currency);
        params.put("description", description);
        params.put("customer", source);
        return Charge.create(params);
    }

    private Customer createCustomer(String customerMail, String cardNumber, Integer monthExpiration, Integer yearExpiration, String cvc) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();
        Map<String, Object> customerParams = new HashMap<String, Object>();
        customerParams.put("description", customerMail);
        customerParams.put("source", createCard(cardNumber, monthExpiration, yearExpiration, cvc).getId());
        return Customer.create(customerParams);
    }

    private Token createCard(String cardNumber, Integer monthExpiration, Integer yearExpiration, String cvc) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();
        Map<String, Object> tokenParams = new HashMap<String, Object>();
        Map<String, Object> cardParams = new HashMap<String, Object>();
        cardParams.put("number", cardNumber);
        cardParams.put("exp_month", monthExpiration);
        cardParams.put("exp_year", yearExpiration);
        cardParams.put("cvc", cvc);
        tokenParams.put("card", cardParams);
        return Token.create(tokenParams);
    }

    private ExternalAccountCollection getCustomerSources(String stripeCustomerToken) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();
        Customer customer = Customer.retrieve(stripeCustomerToken);
        if (customer != null) {
            return customer.getSources();
        }
        return null;
    }

    private Customer getCustomer(String stripeCustomerToken) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();
        return Customer.retrieve(stripeCustomerToken);
    }


}

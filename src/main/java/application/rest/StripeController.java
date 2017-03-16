package application.rest;

import application.configuration.AppProperties;
import application.persistence.entity.User;
import application.rest.domain.PaymentInformationDTO;
import application.service.security.CustomUserDetails;
import application.service.user.UserService;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.model.ExternalAccountCollection;
import com.stripe.model.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pfilip on 5.3.17.
 */
@RestController
@RequestMapping(value = "/payment")
public class StripeController {

    @Autowired
    private UserService userService;

    @Autowired
    private AppProperties appProperties;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> createPayment(@RequestBody PaymentInformationDTO paymentInformation) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();


        User user = null;
        Customer customer = null;

        if (paymentInformation.getCardNumber() == null ||
                paymentInformation.getMonthExpiration() == null ||
                paymentInformation.getYearExpiration() == null ||
                paymentInformation.getCvc() == null ||
                paymentInformation.getAmount() == null ||
                paymentInformation.getCurrency() == null) {
            return ResponseEntity.unprocessableEntity().body("Mising payment information");
        }

        user = CustomUserDetails.getCurrentUser();

        if (user == null) {
            return ResponseEntity.unprocessableEntity().body("User not found");
        }

        //create new customer token
        if (user.getStripeToken() != null) {
            customer = getCustomer(user.getStripeToken());
        }

        if (customer == null) {
            customer = createCustomer(user.getLogin(), paymentInformation.getCardNumber(), paymentInformation.getMonthExpiration(), paymentInformation.getYearExpiration(), paymentInformation.getCvc());
            user.setStripeToken(customer.getId());
            userService.patch(user.toDTO(true));
        }

        return chargeCustomer(paymentInformation.getAmount(), paymentInformation.getCurrency(), paymentInformation.getPaymentDescription(), customer);
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

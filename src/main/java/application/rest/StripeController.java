package application.rest;

import application.configuration.AppProperties;
import application.persistence.entity.User;
import application.service.user.UserService;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.model.ExternalAccountCollection;
import com.stripe.model.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(String cardNumber, Integer monthExpiration, Integer yearExpiration, String cvc,  Principal principal) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();


        User user = null;
        Customer customer = null;


        if (principal != null) {
        }

        if (user != null && user.getStripeToken() != null) {
            customer = getCustomer(user.getStripeToken());
            //todo find user and save stripe token

        }

        if (customer == null) {
           customer = createCustomer("test@test.cz","4242424242424242",3,2018,"123");
        }

        Charge charge1 = createCharge(customer.getId(), 100, "usd", UUID.randomUUID().toString());

        return ResponseEntity.ok(charge1);

    }

    public Charge createCharge(String source, Integer amount, String currency, String description) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("amount", amount);
        params.put("currency", currency);
        params.put("description", description);
        params.put("customer", source);
        return Charge.create(params);
    }

    public Customer createCustomer(String customerMail, String cardNumber, Integer monthExpiration, Integer yearExpiration, String cvc) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
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

    public ExternalAccountCollection getCustomerSources(String stripeCustomerToken) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();
        Customer customer = Customer.retrieve(stripeCustomerToken);
        if (customer != null) {
            return customer.getSources();
        }
        return null;
    }

    public Customer getCustomer(String stripeCustomerToken) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {
        Stripe.apiKey = appProperties.getStripeSecretKey();
        return Customer.retrieve(stripeCustomerToken);
    }


}

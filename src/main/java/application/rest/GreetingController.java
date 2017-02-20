package application.rest;

import java.util.concurrent.atomic.AtomicLong;

import application.api.customer.ReadCustomerByIdRequest;
import application.api.mail.SendPlainTextMailRequest;
import application.rest.domain.Customer;
import application.rest.domain.Greeting;
import application.rest.domain.Mail;
import application.service.customer.CustomerService;
import application.service.domain.CustomerDetails;
import application.service.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private CustomerService customerService;

    @Autowired
    private MailService mailService;

    @RequestMapping("/greeting")
    public ResponseEntity<?> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new ResponseEntity<>(
                new Greeting(
                        counter.incrementAndGet(),
                        String.format(template, name)
                ),
                HttpStatus.OK
        );
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<?> readCustomer(@PathVariable Long customerId) {
        CustomerDetails customerDetails = customerService.readCustomer(
                new ReadCustomerByIdRequest(customerId)
        );
        if (customerDetails != null) {
            return new ResponseEntity<>(
                    Customer.fromDetails(customerDetails),
                    HttpStatus.OK
            );
        }
        return new ResponseEntity<>(
                HttpStatus.NOT_FOUND
        );
    }

    @RequestMapping(value = "/sendMail", method = RequestMethod.POST)
    public ResponseEntity<?> sendMail(@RequestBody Mail mail) {
        mailService.sendMail(
                new SendPlainTextMailRequest(
                        mail.getTo(),
                        mail.getSubject(),
                        mail.getText()
                )
        );
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
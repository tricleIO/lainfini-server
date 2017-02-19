package application.rest;

import java.util.concurrent.atomic.AtomicLong;

import application.api.customer.ReadCustomerByIdRequest;
import application.api.mail.SendMailRequest;
import application.rest.domain.Greeting;
import application.service.customer.CustomerService;
import application.service.mail.MailService;
import hello.Car;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public Greeting update(@RequestBody Car car) {
        System.out.println(customerService.readCustomer(new ReadCustomerByIdRequest(1L)));
        mailService.sendMail(new SendMailRequest());
        return new Greeting(counter.incrementAndGet(),
                String.format(template, car.getVIN()));
    }
}
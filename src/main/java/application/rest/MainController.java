package application.rest;

import application.rest.domain.CustomerDTO;
import application.service.response.ServiceResponse;
import application.rest.domain.Mail;
import application.service.customer.CustomerService;
import application.service.mail.MailService;
import application.service.nexmo.SMSClientServiceImpl;
import application.service.nexmo.model.SMSMessageRestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<?> readCustomer(@PathVariable Long customerId) {
        ServiceResponse<CustomerDTO> response = customerService.read(
                customerId
        );
        if (response.isSuccessful()) {
            return new ResponseEntity<>(
                    response.getBody(),
                    HttpStatus.OK
            );
        } else {
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND
            );
        }
    }

    @RequestMapping(value = "/sendMail", method = RequestMethod.POST)
    public ResponseEntity<?> sendMail(@RequestBody Mail mail) {
        mailService.sendMail(
                mail.getTo(),
                mail.getSubject(),
                mail.getText()
        );
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/sendSMSMessage", method = RequestMethod.POST)
    public ResponseEntity<?> sendSMSMessage(@RequestBody SMSMessageRestModel smsMessageRestModel) {
        SMSClientServiceImpl smsClient = new SMSClientServiceImpl();
        smsClient.sendMessage(smsMessageRestModel.getToPhoneNumber(), smsMessageRestModel.getMessageText());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
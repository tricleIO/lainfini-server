package application.rest;

import application.rest.domain.MailDTO;
import application.service.mail.MailService;
import application.service.nexmo.SMSClientServiceImpl;
import application.service.nexmo.model.SMSMessageRestModel;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/sendMail", method = RequestMethod.POST)
    public ResponseEntity<?> sendMail(@RequestBody MailDTO mail) {
        ServiceResponse<MailDTO> mailResponse = mailService.sendMail(mail);
        return new ResponseEntity<>(mailResponse.getBody(), HttpStatus.OK);
    }

    @RequestMapping(value = "/sendSMSMessage", method = RequestMethod.POST)
    public ResponseEntity<?> sendSMSMessage(@RequestBody SMSMessageRestModel smsMessageRestModel) {
        SMSClientServiceImpl smsClient = new SMSClientServiceImpl();
        smsClient.sendMessage(smsMessageRestModel.getToPhoneNumber(), smsMessageRestModel.getMessageText());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
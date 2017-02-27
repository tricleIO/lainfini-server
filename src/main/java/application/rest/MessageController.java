package application.rest;

import application.rest.domain.MailDTO;
import application.service.mail.MailService;
import application.service.mailchimp.MailChimpService;
import application.service.mailchimp.model.MailChimpSubscribeModel;
import application.service.nexmo.SMSClientService;
import application.service.nexmo.model.SMSMessageRestModel;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MailService mailService;

    @Autowired
    private MailChimpService mailChimpService;

    @Autowired
    private SMSClientService smsClientService;

    @RequestMapping(value = "/sendMail", method = RequestMethod.POST)
    public ResponseEntity<?> sendMail(@RequestBody MailDTO mail) {
        ServiceResponse<MailDTO> mailResponse = mailService.sendMail(mail);
        return new ResponseEntity<>(mailResponse.getBody(), HttpStatus.OK);
    }

    @RequestMapping(value = "/sendSMSMessage", method = RequestMethod.POST)
    public ResponseEntity<?> sendSMSMessage(@RequestBody SMSMessageRestModel smsMessageRestModel) {
        smsClientService.sendMessage(smsMessageRestModel.getToPhoneNumber(), smsMessageRestModel.getMessageText());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/addNewsletterSubscriber", method = RequestMethod.POST)
    public ResponseEntity<?> addNewsletterSubscriber(@RequestBody MailChimpSubscribeModel mail) {
        try {
            mailChimpService.addMemberToList(mail.getListId(),mail.getMail());
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
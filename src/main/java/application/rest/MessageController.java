package application.rest;

import application.persistence.type.UserRoleEnum;
import application.rest.domain.MailDTO;
import application.service.mail.MailService;
import application.service.mailchimp.MailChimpService;
import application.service.mailchimp.model.MailChimpSubscribeModel;
import application.service.nexmo.SMSClientService;
import application.service.nexmo.model.SMSMessageRestModel;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @Autowired
    private MailService mailService;

    @Autowired
    private MailChimpService mailChimpService;

    @Autowired
    private SMSClientService smsClientService;

    private UserService userService;

    @RequestMapping(value = "/sendMail", method = RequestMethod.POST)
    public ResponseEntity<?> sendMail(@RequestBody MailDTO mail) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        ServiceResponse<MailDTO> mailResponse = mailService.sendMail(mail);
        return new ResponseEntity<>(mailResponse.getBody(), HttpStatus.OK);
    }

    @RequestMapping(value = "/sendSMSMessage", method = RequestMethod.POST)
    public ResponseEntity<?> sendSMSMessage(@RequestBody SMSMessageRestModel smsMessageRestModel) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        smsClientService.sendMessage(smsMessageRestModel.getToPhoneNumber(), smsMessageRestModel.getMessageText());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/addNewsletterSubscriber", method = RequestMethod.POST)
    public ResponseEntity<?> addNewsletterSubscriber(@RequestBody MailChimpSubscribeModel mail) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        try {
            mailChimpService.addMemberToList(mail.getListId(),mail.getMail());
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getMailChimpLists", method = RequestMethod.GET)
    public ResponseEntity<?> getMailChimpLists() {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return mailChimpService.getLists();
    }

    @RequestMapping(value = "/getMailChimpLists/{listId}", method = RequestMethod.GET)
    public ResponseEntity<?> getMailChimpLists(@PathVariable String listId) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return mailChimpService.getLists(listId);
    }



}
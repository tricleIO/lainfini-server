package application.service.mailchimp;

import application.configuration.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Created by pfilip on 21.2.17.
 */
@Service
public class MailChimpServiceImpl implements MailChimpService {

    private final AppProperties appProperties;

    private MailChimpConnection mailChimpConnection;


    @Autowired
    public MailChimpServiceImpl(AppProperties appProperties) {
        mailChimpConnection = new MailChimpConnection(appProperties.getMailchimpApiKey());
        this.appProperties = appProperties;
    }

    @Override
    public void addMemberToList(String listId, String subscriberMail) {
        mailChimpConnection.addMemberToList(listId,subscriberMail);
    }

    @Override
    public ResponseEntity<?> getLists() {
       return mailChimpConnection.getLists();
    }

    @Override
    public ResponseEntity<?> getLists(String listId) {
        return mailChimpConnection.getLists(listId);
    }
}

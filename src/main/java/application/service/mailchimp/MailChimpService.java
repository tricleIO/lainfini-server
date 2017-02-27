package application.service.mailchimp;

import org.springframework.http.ResponseEntity;

/**
 * Created by pfilip on 21.2.17.
 */
public interface MailChimpService {

    void addMemberToList(String listId, String subscriberMail);

    ResponseEntity<?> getLists();

    ResponseEntity<?> getLists(String listId);
}

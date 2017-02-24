package application.service.mailchimp;

/**
 * Created by pfilip on 21.2.17.
 */
public interface MailChimpService {

    void addMemberToList(String listId, String subscriberMail) throws Exception;
}

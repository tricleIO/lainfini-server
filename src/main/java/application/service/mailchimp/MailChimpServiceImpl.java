package application.service.mailchimp;

import connection.MailChimpConnection;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.net.URL;

/**
 * Created by pfilip on 21.2.17.
 */
@Service
public class MailChimpServiceImpl implements MailChimpService {

    MailChimpConnection connection;

    public MailChimpServiceImpl() {
        connection = new MailChimpConnection("4066ba9c09ef09535a5133dc51eb3fd4-us15");
    }

    public void addMemberToList(String listId, String subscriberMail) throws Exception {
        JSONObject jsonList = new JSONObject();
        jsonList.put("email_address", subscriberMail);
        jsonList.put("status", "subscribed");
        connection.do_Post(new URL(connection.getListendpoint()+"/"+listId+"/members"), jsonList.toString(),connection.getApikey());
    }
}

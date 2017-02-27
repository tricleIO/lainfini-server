package application.service.mailchimp;

import application.configuration.AppProperties;
import connection.MailChimpConnection;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;

/**
 * Created by pfilip on 21.2.17.
 */
@Service
public class MailChimpServiceImpl implements MailChimpService {

    private final AppProperties appProperties;

    private MailChimpConnection connection;

    @Autowired
    public MailChimpServiceImpl(AppProperties appProperties) {
        this.appProperties = appProperties;
        connection = new MailChimpConnection(this.appProperties.getMailchimpApiKey());
    }

    public void addMemberToList(String listId, String subscriberMail) throws Exception {
        JSONObject jsonList = new JSONObject();
        jsonList.put("email_address", subscriberMail);
        jsonList.put("status", "subscribed");
        connection.do_Post(new URL(connection.getListendpoint()+"/"+listId+"/members"), jsonList.toString(),connection.getApikey());
    }
}

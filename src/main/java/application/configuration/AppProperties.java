package application.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pfilip on 25.2.17.
 */
@Configuration
@Data
public class AppProperties implements Serializable {

    @Value("${mailchimp.apikey:null}")
    private String mailchimpApiKey;

    @Value("${mailgun.domain:null}")
    private String mailgunDomain;

    @Value("${mailgun.apikey:null}")
    private String mailgunApiKey;

    @Value("${mailgun.from.name:null}")
    private String mailgunFromName;

    @Value("${mailgun.from.email:null}")
    private String mailgunFromEmail;

    @Value("${nexmo.apikey:null}")
    private String nexmoApiKey;

    @Value("${nexmo.apisecret:null}")
    private String nexmoApiSecret;

    @Value("${nexmo.from.name:null}")
    private String nexmoFromName;

    @Value("${stripe.secretKey:null}")
    private String stripeSecretKey;

    @Value("${stripe.publishableKey:null}")
    private String stripePublishableKey;

    @Value("${document.location:null}")
    private String documentStoreLocation;

    @Value("${photo.resize.to:null}")
    private String[] photoDefaultResizeTo;

    @Value("${lainfini.server.address:null}")
    private String serverAddress;

    @PostConstruct
    private void testValueContent() {

        for (Field f : AppProperties.class.getDeclaredFields()) {
            try {
                if (f.get(this).toString().equals("null")) {
                    System.out.println(f.getName() + " is not filled");
                    throw new NullPointerException("Config failed: " +f.getName() + " is not filled");

                }
            } catch (IllegalAccessException e) {
                throw new NullPointerException("Config failed");
            }
        }
    }

    public List<String> getSellerEmails() {
        List<String> sellerEmails = new LinkedList<>();
        sellerEmails.add("jan.merta.90@gmail.com");
//        sellerEmails.add("jan.merta@tricle.io");
//        sellerEmails.add("petr.filip@tricle.io");
//        sellerEmails.add("michal.fikejs@tricle.io");
//        sellerEmails.add("pavel.janku@tricle.io");
        return sellerEmails;
    }

}

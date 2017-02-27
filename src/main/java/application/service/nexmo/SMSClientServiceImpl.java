package application.service.nexmo;


import application.configuration.AppProperties;
import application.service.nexmo.model.IncomingNexmoResponse;
import com.google.gson.Gson;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by pfilip on 21.2.17.
 */
@Service
public class SMSClientServiceImpl implements SMSClientService {

    private final AppProperties appProperties;

    private static String URL = "https://rest.nexmo.com/sms/json";

    @Autowired
    public SMSClientServiceImpl(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    public IncomingNexmoResponse sendMessage(String toPhoneNumber, String messageText) {
        HttpClient client = new HttpClient();

        PostMethod method = new PostMethod(URL);

        NameValuePair apiKeyNVP = new NameValuePair("api_key", appProperties.getNexmoApiKey());
        NameValuePair apiSecretNVP = new NameValuePair("api_secret", appProperties.getNexmoApiSecret());
        NameValuePair toNVP = new NameValuePair("to", toPhoneNumber);
        NameValuePair fromNVP = new NameValuePair("from", appProperties.getNexmoFromName());
        NameValuePair textNVP = new NameValuePair("text", messageText);

        method.setQueryString(new NameValuePair[]{apiKeyNVP, apiSecretNVP, toNVP, fromNVP, textNVP});

        try {
            int statusCode = client.executeMethod(method);

            System.out.println("ServiceResponseStatus Code = " + statusCode);
            System.out.println("QueryString>>> " + method.getQueryString());
            System.out.println("ServiceResponseStatus Text>>>" + HttpStatus.getStatusText(statusCode));

            //Get data as a String
            System.out.println(method.getResponseBodyAsString());

            //OR as a byte array
            //byte[] res = method.getResponseBody();

            Gson gson = new Gson();
            IncomingNexmoResponse incomingNexmoResponse = gson.fromJson(method.getResponseBodyAsString(), IncomingNexmoResponse.class);

            //release connection
            method.releaseConnection();
            return incomingNexmoResponse;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}

package application.service.nexmo;


import application.service.nexmo.model.IncomingNexmoResponse;
import com.google.gson.Gson;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;

/**
 * Created by pfilip on 21.2.17.
 */
public class SMSClientServiceImpl implements SMSClientService {

    private static String URL = "https://rest.nexmo.com/sms/json";

    public IncomingNexmoResponse sendMessage(String toPhoneNumber, String messageText) {
        HttpClient client = new HttpClient();

        PostMethod method = new PostMethod(URL);

        NameValuePair nvp1 = new NameValuePair("api_key", "306c28aa");
        NameValuePair nvp2 = new NameValuePair("api_secret", "1b5f23407a4c2f39");
        NameValuePair nvp3 = new NameValuePair("to", toPhoneNumber);
        NameValuePair nvp4 = new NameValuePair("from", "Nexmo");
        NameValuePair nvp5 = new NameValuePair("text", messageText);

        method.setQueryString(new NameValuePair[]{nvp1, nvp2, nvp3, nvp4, nvp5});

        try {
            int statusCode = client.executeMethod(method);

            System.out.println("Status Code = " + statusCode);
            System.out.println("QueryString>>> " + method.getQueryString());
            System.out.println("Status Text>>>" + HttpStatus.getStatusText(statusCode));

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

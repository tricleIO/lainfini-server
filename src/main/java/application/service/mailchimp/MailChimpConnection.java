package application.service.mailchimp;

import application.service.Connection;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pfilip on 27.2.17.
 */
public class MailChimpConnection extends Connection {

    private final String listsEndpoint;
    private final String server;
    private final String apikey;


    public MailChimpConnection(String apikey) {
        this.apikey = "apikey "+apikey;
        this.server = apikey.split("-")[1];
        this.listsEndpoint = "https://"+server+".api.mailchimp.com/3.0/lists";
    }

    public ResponseEntity<?> doMailChimpRequest(String url, HttpMethod httpMethod, JSONObject jsonObject) {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        requestHeaders.add("Authorization", this.apikey);

        HttpEntity<?> requestEntity = new HttpEntity<Object>(jsonObject.toString(), requestHeaders);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        ResponseEntity<String> stringResponseEntity = doRequest(url, httpMethod, requestHeaders, jsonObject, String.class);
        return stringResponseEntity;
    }

    public ResponseEntity<?> doMailChimpRequest(String url, HttpMethod httpMethod) {
        return doMailChimpRequest(url,httpMethod,new JSONObject());
    }

    public ResponseEntity<?> addMemberToList(String listId, String subscriberMail) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email_address", subscriberMail);
        jsonObject.put("status", "subscribed");

        return doMailChimpRequest(listsEndpoint +"/"+listId+"/members", HttpMethod.POST, jsonObject);
    }

    public ResponseEntity<?> getLists() {
        return doMailChimpRequest(listsEndpoint,HttpMethod.GET);
    }

    public ResponseEntity<?> getLists(String listId) {
        return doMailChimpRequest(listsEndpoint +"/"+listId,HttpMethod.GET);
    }
}

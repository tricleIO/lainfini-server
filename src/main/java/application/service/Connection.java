package application.service;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pfilip on 27.2.17.
 */
public class Connection {

    public static <T> ResponseEntity<T> doRequest(String url, HttpMethod httpMethod , HttpHeaders httpHeaders, JSONObject jsonObject, Class<T> clazz) {

        HttpEntity<?> requestEntity;
        if (httpHeaders == null) {
            requestEntity = new HttpEntity<Object>(jsonObject.toString());
        } else {
            requestEntity = new HttpEntity<Object>(jsonObject.toString(), httpHeaders);
        }

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        ResponseEntity<T> response = restTemplate.exchange(url, httpMethod, requestEntity, clazz);
        return response;
    }

    public static <T> ResponseEntity<T> doRequest(String url, HttpMethod httpMethod , HttpEntity httpEntity, Class<T> clazz) {

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        ResponseEntity<T> response = restTemplate.exchange(url, httpMethod, httpEntity, clazz);
        return response;
    }


}

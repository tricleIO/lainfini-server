package application.service.abra;

import application.service.abra.client.model.Storecard;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.codec.binary.Base64;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by pfilip on 27.3.17.
 */
@Service
public class AbraServiceImpl implements AbraService {

    //skladové karty
     public static final String URL = "http://ahri.srv.lainfini.com:81/testapi/";

    @Override
    public List<Storecard> getStorecardList() {
        String url = URL + "storecards";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        ResponseEntity<String> forObject = restTemplate.exchange(url, HttpMethod.GET,
                new HttpEntity<Object>(createHeaders("Supervisor", "")),
                new ParameterizedTypeReference<String>() {
                });
        String body = forObject.getBody();
        GsonBuilder gsb = new GsonBuilder();
        gsb.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        Gson gson = gsb.create();
        Object o = gson.fromJson(body, new TypeToken<List<Storecard>>() {
        }.getType());
        return null;
    }

    @Override
    public Storecard createStorecard(Storecard storecard) {
        return null;
    }

    @Override
    public Storecard getStorecard(String id) {
        return null;
    }

    @Override
    public Storecard updateStorecard(String id) {
        return null;
    }

    @Override
    public boolean deleteStorecard(String id) {
        return false;
    }

    private HttpHeaders createHeaders(final String username, final String password ){
        HttpHeaders headers =  new HttpHeaders(){
            {
                String auth = username + ":" + password;
                byte[] encodedAuth = Base64.encodeBase64(
                        auth.getBytes(Charset.forName("UTF-8")) );
                String authHeader = "Basic " + new String( encodedAuth );
                set( "Authorization", authHeader );
            }
        };
        return headers;
    }

}

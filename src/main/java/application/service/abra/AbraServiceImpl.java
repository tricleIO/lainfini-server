package application.service.abra;

import application.configuration.gsonAdapter.DateTimeTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.codec.binary.Base64;
import org.joda.time.DateTime;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.UriTemplate;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by pfilip on 27.3.17.
 */
public abstract class AbraServiceImpl<T> implements AbraService {

    public static final String URL = "http://ahri.srv.lainfini.com:81/testapi/";

    private final String getJson(String url, HttpMethod httpMethod, Object requestBodyObject) {
        RestTemplate restTemplate = new RestTemplate();
        //keep it off
//        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
//        interceptors.add(new LoggingRequestInterceptor());
//        restTemplate.setInterceptors(interceptors);
        //keep it on
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        stringHttpMessageConverter.setWriteAcceptCharset(false);
        restTemplate.getMessageConverters().add(0, stringHttpMessageConverter);
        HttpEntity<Object> httpEntity;
        HttpHeaders httpHeaders = createHeaders("Supervisor", "");
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        if (requestBodyObject == null) {
            httpEntity = new HttpEntity<>(httpHeaders);
        } else {
            httpEntity = new HttpEntity<>(convertObjectToJson(requestBodyObject), httpHeaders);
        }


        UriTemplate uriTemplate = new UriTemplate(url);

        String decode = null;
        try {
            decode = URLDecoder.decode(uriTemplate.toString(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        ResponseEntity<String> forObject = restTemplate.exchange(decode, httpMethod,
                httpEntity,
                new ParameterizedTypeReference<String>() {
                });
        return forObject.getBody();
    }

    public final <T> T requestAbra(String url, HttpMethod httpMethod, Class<T> clazz, boolean returnCollection) {
        return requestAbra(url, httpMethod, null, clazz, returnCollection);
    }

    public final <T> T requestAbra(String url, HttpMethod httpMethod, Object requestBodyObject, Class<T> clazz, boolean returnCollection) {
        String json = getJson(url, httpMethod, requestBodyObject);
        if (returnCollection) {
            return convertJsonToCollectionObject(json, clazz);
        } else {
            return convertJsonToObject(json, clazz);
        }
    }

    public final static <T> T convertJsonToObject(String json, Class<T> clazz) {
        GsonBuilder gsb = new GsonBuilder();
        gsb.registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter());
        Gson gson = gsb.create();
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, clazz);
        return gson.fromJson(json, type);
    }

    public final static String convertObjectToJson(Object object) {
        GsonBuilder gsb = new GsonBuilder();
        gsb.registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter());
        Gson gson = gsb.create();
        return gson.toJson(object);
    }

    public final static <T> T convertJsonToCollectionObject(String json, Class<T> clazz) {
        GsonBuilder gsb = new GsonBuilder();
        gsb.registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter());
        Gson gson = gsb.create();
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, clazz);
        return gson.fromJson(json, type);
    }

    private HttpHeaders createHeaders(final String username, final String password) {
        HttpHeaders headers = new HttpHeaders() {
            {
                String auth = username + ":" + password;
                byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("UTF-8")));
                String authHeader = "Basic " + new String(encodedAuth);
                set("Authorization", authHeader);
                set("Accept-Charset","utf-8");
                set("Accept","text/plain, application/json");
            }
        };
        return headers;
    }


}

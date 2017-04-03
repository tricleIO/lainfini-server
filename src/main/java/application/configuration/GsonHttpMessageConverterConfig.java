package application.configuration;

import application.configuration.gsonAdapter.DateTimeTypeAdapter;
import application.configuration.gsonAdapter.InterfaceAdapter;
import application.configuration.gsonAdapter.SpringfoxJsonToGsonAdapter;
import application.configuration.gsonAdapter.SuperclassExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.joda.time.DateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import springfox.documentation.spring.web.json.Json;

/**
 * Created by pfilip on 29.3.17.
 */
@Configuration
public class GsonHttpMessageConverterConfig {

    @Bean
    public GsonHttpMessageConverter gsonHttpMessageConverter(Gson gson) {
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder gsb = new GsonBuilder();
        gsb.setDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        gsb.registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter());
        gsb.registerTypeAdapter(OAuth2AccessToken.class, new InterfaceAdapter<OAuth2AccessToken>());
        gsb.registerTypeAdapter(Json.class, new SpringfoxJsonToGsonAdapter());
        gsb.addDeserializationExclusionStrategy(new SuperclassExclusionStrategy());
        gsb.addSerializationExclusionStrategy(new SuperclassExclusionStrategy());
        Gson gsonWithAdapter = gsb.create();
        converter.setGson(gsonWithAdapter);
        return converter;
    }
}

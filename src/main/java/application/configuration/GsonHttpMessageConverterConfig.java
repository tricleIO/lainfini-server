package application.configuration;

import application.service.abra.AbraServiceImpl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.joda.time.DateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

/**
 * Created by pfilip on 29.3.17.
 */
@Configuration
public class GsonHttpMessageConverterConfig {

    @Bean
    public GsonHttpMessageConverter gsonHttpMessageConverter(Gson gson) {
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder gsb = new GsonBuilder();
        gsb.registerTypeAdapter(DateTime.class, new AbraServiceImpl.DateTimeTypeAdapter());
        Gson gsonWithAdapter = gsb.create();
        converter.setGson(gsonWithAdapter);
        return converter;
    }
}

package application.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;

/**
 * Created by pfilip on 25.2.17.
 */
@Configuration
@Data
public class AppProperties {

    @Value("${mailchimp.apikey:null}")
    private String mailchimpApiKey;


    @PostConstruct
    private void testValueContent() {

        for (Field f : AppProperties.class.getDeclaredFields()) {
            try {
                if (f.get(this).toString().equals("null")) {
                    System.out.println(f.getName() + " is not filled");
                }
            } catch (IllegalAccessException e) {
                throw new NullPointerException("Config failed");
            }
        }
    }
}

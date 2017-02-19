package application.configuration;

import application.service.mail.MailService;
import application.service.mail.MailServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MailService mailService() {
        return new MailServiceImpl();
    }

}

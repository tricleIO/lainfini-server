package application.configuration;

import application.service.mail.MailService;
import application.service.mail.MailServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MailService mailService() {
        net.sargue.mailgun.Configuration configuration = new net.sargue.mailgun.Configuration()
                .domain("sandbox84f18e68139b47b5a326c912cb4b3c38.mailgun.org")
                .apiKey("key-7fcc1bc67e3bb8cbae048b6e872904be")
                .from("Test", "mailgun@sandbox84f18e68139b47b5a326c912cb4b3c38.mailgun.org");
        return new MailServiceImpl(configuration);
    }

}

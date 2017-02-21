package application.service.mail;

import net.sargue.mailgun.Configuration;
import net.sargue.mailgun.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailgunMailServiceImpl implements MailService {

    @Autowired
    private final Configuration configuration;

    public MailgunMailServiceImpl(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void sendMail(String to, String subject, String text) {
        Mail.using(configuration)
                .to(to)
                .subject(subject)
                .text(text)
                .build()
                .send();
    }

}

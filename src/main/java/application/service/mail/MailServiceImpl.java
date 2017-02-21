package application.service.mail;

import net.sargue.mailgun.Configuration;
import net.sargue.mailgun.Mail;

public class MailServiceImpl implements MailService {

    private final Configuration configuration;

    public MailServiceImpl(Configuration configuration) {
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

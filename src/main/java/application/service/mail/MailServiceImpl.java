package application.service.mail;

import application.api.mail.SendPlainTextMailRequest;
import net.sargue.mailgun.Configuration;
import net.sargue.mailgun.Mail;

public class MailServiceImpl implements MailService {

    private final Configuration configuration;

    public MailServiceImpl(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void sendMail(SendPlainTextMailRequest sendMailRequest) {
        Mail.using(configuration)
                .to(sendMailRequest.to)
                .subject(sendMailRequest.subject)
                .text(sendMailRequest.text)
                .build()
                .send();
    }

}

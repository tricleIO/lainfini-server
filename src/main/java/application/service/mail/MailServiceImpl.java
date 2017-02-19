package application.service.mail;

import application.api.mail.SendMailRequest;
import net.sargue.mailgun.Configuration;
import net.sargue.mailgun.Mail;

public class MailServiceImpl implements MailService {

    private final Configuration configuration;

    public MailServiceImpl() {
        this.configuration = new Configuration()
                .domain("sandbox84f18e68139b47b5a326c912cb4b3c38.mailgun.org")
                .apiKey("key-7fcc1bc67e3bb8cbae048b6e872904be")
                .from("Test", "mailgun@sandbox84f18e68139b47b5a326c912cb4b3c38.mailgun.org");
    }

    @Override
    public void sendMail(SendMailRequest sendMailRequest) {
        Mail.using(configuration)
                .to("jan.merta.90@gmail.com")
                .subject("predmet")
                .text("cau kamo")
                .build()
                .send();
    }
}

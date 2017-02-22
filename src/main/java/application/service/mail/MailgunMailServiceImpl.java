package application.service.mail;

import application.rest.domain.MailDTO;
import application.service.response.ServiceResponse;
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
    public ServiceResponse<MailDTO> sendMail(MailDTO mail) {
        Mail.using(configuration)
                .to(mail.getTo())
                .subject(mail.getSubject())
                .text(mail.getText())
                .build()
                .send();
        return ServiceResponse.success(mail);
    }

}

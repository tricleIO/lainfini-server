package application.service.mail;

import application.api.mail.SendMailRequest;
import org.springframework.stereotype.Service;

@Service
public interface MailService {

    void sendMail(SendMailRequest sendMailRequest);

}

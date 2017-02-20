package application.service.mail;

import application.api.mail.SendPlainTextMailRequest;
import org.springframework.stereotype.Service;

@Service
public interface MailService {

    void sendMail(SendPlainTextMailRequest sendMailRequest);

}

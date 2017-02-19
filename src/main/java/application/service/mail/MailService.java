package application.service.mail;

import application.api.SendMailRequest;
import org.springframework.stereotype.Service;

@Service
public interface MailService {

    void sendMail(SendMailRequest sendMailRequest);

}

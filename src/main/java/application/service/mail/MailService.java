package application.service.mail;

import application.rest.domain.MailDTO;
import application.service.response.ServiceResponse;
import org.springframework.stereotype.Service;

@Service
public interface MailService {

    ServiceResponse<MailDTO> sendMail(MailDTO mail);

}

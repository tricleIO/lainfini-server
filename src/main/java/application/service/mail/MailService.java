package application.service.mail;

import application.rest.domain.MailDTO;
import application.service.response.ServiceResponse;

public interface MailService {

    ServiceResponse<MailDTO> sendMail(MailDTO mail);

}

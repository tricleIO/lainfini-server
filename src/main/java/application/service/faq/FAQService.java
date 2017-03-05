package application.service.faq;

import application.persistence.entity.FAQ;
import application.rest.domain.FaqDTO;
import application.service.DatabaseServiceInterface;

public interface FAQService extends DatabaseServiceInterface<FAQ, Integer, FaqDTO> {

}

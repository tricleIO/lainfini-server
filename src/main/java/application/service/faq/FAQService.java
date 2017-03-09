package application.service.faq;

import application.persistence.entity.FAQ;
import application.rest.domain.FaqDTO;
import application.service.BaseDatabaseService;

public interface FAQService extends BaseDatabaseService<FAQ, Integer, FaqDTO> {

}

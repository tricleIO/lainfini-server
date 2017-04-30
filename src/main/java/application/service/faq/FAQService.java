package application.service.faq;

import application.persistence.entity.FAQ;
import application.rest.domain.FaqDTO;
import application.service.BaseSoftDeletableDatabaseService;

public interface FAQService extends BaseSoftDeletableDatabaseService<FAQ, Integer, FaqDTO> {

}

package application.service.faq;

import application.persistence.entity.FAQ;
import application.persistence.repository.FAQRepository;
import application.rest.domain.FaqDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FAQServiceImpl extends BaseDatabaseServiceImpl<FAQ, Integer, FAQRepository, FaqDTO> implements FAQService {

    @Autowired
    private FAQRepository faqRepository;

    @Override
    public FAQRepository getRepository() {
        return faqRepository;
    }

}

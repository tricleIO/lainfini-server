package application.rest;

import application.persistence.entity.FAQ;
import application.rest.domain.FaqDTO;
import application.service.faq.FAQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/faqs")
public class FAQController extends AbstractDatabaseController<FAQ, Integer, FaqDTO, FAQService> {

    @Autowired
    private FAQService faqService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readFAQs(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readFAQ(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createFAQ(@RequestBody FaqDTO faqDTO) {
        return create(faqDTO);
    }

    @Override
    public FAQService getBaseService() {
        return faqService;
    }

}
package application.service.flash;

import application.persistence.entity.Flash;
import application.persistence.repository.FlashRepository;
import application.rest.domain.FlashDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlashServiceImpl extends BaseDatabaseServiceImpl<Flash, Integer, FlashRepository, FlashDTO> implements FlashService {

    @Autowired
    private FlashRepository flashRepository;

    @Override
    public FlashRepository getRepository() {
        return flashRepository;
    }

}

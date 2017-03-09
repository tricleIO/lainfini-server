package application.service.soldItemsCall;

import application.persistence.entity.CallToAction;
import application.persistence.repository.CallToActionRepository;
import application.rest.domain.CallDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallToActionServiceImpl extends BaseDatabaseServiceImpl<CallToAction, Integer, CallToActionRepository, CallDTO> implements CallToActionService {

    @Autowired
    private CallToActionRepository soldItemsCallRepository;

    @Override
    public CallToActionRepository getRepository() {
        return soldItemsCallRepository;
    }

}

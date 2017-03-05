package application.service.soldItemsCall;

import application.persistence.entity.CallToAction;
import application.rest.domain.CallDTO;
import application.service.DatabaseServiceInterface;

public interface CallToActionService extends DatabaseServiceInterface<CallToAction, Integer, CallDTO> {

}

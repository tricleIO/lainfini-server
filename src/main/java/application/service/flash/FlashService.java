package application.service.flash;

import application.persistence.entity.Flash;
import application.rest.domain.FlashDTO;
import application.service.DatabaseServiceInterface;

public interface FlashService extends DatabaseServiceInterface<Flash, Integer, FlashDTO> {

}

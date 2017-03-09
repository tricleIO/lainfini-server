package application.service.flash;

import application.persistence.entity.Flash;
import application.rest.domain.FlashDTO;
import application.service.BaseDatabaseService;

public interface FlashService extends BaseDatabaseService<Flash, Integer, FlashDTO> {

}

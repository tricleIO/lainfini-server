package application.service.technology;

import application.persistence.entity.Technology;
import application.rest.domain.TechnologyDTO;
import application.service.BaseDatabaseService;

public interface TechnologyService extends BaseDatabaseService<Technology, Integer, TechnologyDTO> {

}

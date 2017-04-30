package application.service.technology;

import application.persistence.entity.Technology;
import application.rest.domain.TechnologyDTO;
import application.service.BaseSoftDeletableDatabaseService;

public interface TechnologyService extends BaseSoftDeletableDatabaseService<Technology, Integer, TechnologyDTO> {

}

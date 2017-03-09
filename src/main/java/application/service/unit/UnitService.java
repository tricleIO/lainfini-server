package application.service.unit;

import application.persistence.entity.Unit;
import application.rest.domain.UnitDTO;
import application.service.BaseDatabaseService;

public interface UnitService extends BaseDatabaseService<Unit, Integer, UnitDTO> {

}

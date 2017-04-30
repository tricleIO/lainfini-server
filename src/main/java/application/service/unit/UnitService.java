package application.service.unit;

import application.persistence.entity.Unit;
import application.rest.domain.UnitDTO;
import application.service.BaseSoftDeletableDatabaseService;

public interface UnitService extends BaseSoftDeletableDatabaseService<Unit, Integer, UnitDTO> {

}

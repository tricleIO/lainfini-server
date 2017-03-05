package application.service.unit;

import application.persistence.entity.Unit;
import application.rest.domain.UnitDTO;
import application.service.DatabaseServiceInterface;

public interface UnitService extends DatabaseServiceInterface<Unit, Integer, UnitDTO> {

}

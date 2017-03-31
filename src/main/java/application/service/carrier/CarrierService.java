package application.service.carrier;

import application.persistence.entity.Carrier;
import application.rest.domain.CarrierDTO;
import application.service.BaseDatabaseService;

public interface CarrierService extends BaseDatabaseService<Carrier, Integer, CarrierDTO> {

}

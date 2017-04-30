package application.service.carrier;

import application.persistence.entity.Carrier;
import application.rest.domain.CarrierDTO;
import application.service.BaseSoftDeletableDatabaseService;

public interface CarrierService extends BaseSoftDeletableDatabaseService<Carrier, Integer, CarrierDTO> {

}

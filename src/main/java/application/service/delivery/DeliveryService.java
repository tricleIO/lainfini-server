package application.service.delivery;

import application.persistence.entity.Delivery;
import application.rest.domain.DeliveryDTO;
import application.service.BaseDatabaseService;

public interface DeliveryService extends BaseDatabaseService<Delivery, Integer, DeliveryDTO> {

}

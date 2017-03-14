package application.service.delivery;

import application.persistence.entity.Delivery;
import application.persistence.repository.DeliveryRepository;
import application.rest.domain.DeliveryDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl extends BaseDatabaseServiceImpl<Delivery, Integer, DeliveryRepository, DeliveryDTO> implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public DeliveryRepository getRepository() {
        return deliveryRepository;
    }

}

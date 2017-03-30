package application.service.shippingRegion;

import application.persistence.entity.ShippingRegion;
import application.persistence.repository.ShippingRegionRepository;
import application.rest.domain.ShippingRegionDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingRegionServiceImpl extends BaseDatabaseServiceImpl<ShippingRegion, Integer, ShippingRegionRepository, ShippingRegionDTO> implements ShippingRegionService {

    @Autowired
    private ShippingRegionRepository shippingRegionRepository;

    @Override
    public ShippingRegionRepository getRepository() {
        return shippingRegionRepository;
    }

}

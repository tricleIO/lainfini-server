package application.service.delivery;

import application.persistence.entity.Delivery;
import application.persistence.repository.DeliveryRepository;
import application.rest.domain.ShippingDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.response.ServiceResponseStatus;
import application.service.shippingTariff.ShippingTariffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl extends BaseDatabaseServiceImpl<Delivery, Long, DeliveryRepository, ShippingDTO> implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private ShippingTariffService shippingTariffService;

    @Override
    protected AdditionalDataManipulatorBatch<ShippingDTO> getAdditionalDataLoaderBatch(ShippingDTO dto) {
        AdditionalDataManipulatorBatch<ShippingDTO> batch = super.getAdditionalDataLoaderBatch(dto);
        // add shipping tariff
        batch.add(d -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(d.getShippingTariffUid(), shippingTariffService::read),
                new AdditionalDataManipulator.Writer<>(d::setShippingTariff),
                ServiceResponseStatus.SHIPPING_TARIFF_NOT_FOUND
        ));
        return batch;
    }

    @Override
    public DeliveryRepository getRepository() {
        return deliveryRepository;
    }

}

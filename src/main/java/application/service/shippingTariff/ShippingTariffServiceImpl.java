 package application.service.shippingTariff;

import application.persistence.entity.ShippingTariff;
import application.persistence.repository.ShippingTariffRepository;
import application.rest.domain.ShippingTariffDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.carrier.CarrierService;
import application.service.product.ApplicationFileService;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingTariffServiceImpl extends BaseDatabaseServiceImpl<ShippingTariff, Integer, ShippingTariffRepository, ShippingTariffDTO> implements ShippingTariffService {

    @Autowired
    private ShippingTariffRepository shippingTariffRepository;

    @Autowired
    private CarrierService carrierService;

    @Autowired
    private ApplicationFileService applicationFileService;

    @Override
    protected AdditionalDataManipulatorBatch<ShippingTariffDTO> getAdditionalDataLoaderBatch(ShippingTariffDTO dto) {
        AdditionalDataManipulatorBatch<ShippingTariffDTO> batch = new AdditionalDataManipulatorBatch<>(dto);
        // add carrier
        batch.add(st -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(st.getCarrierUid(), carrierService::read),
                new AdditionalDataManipulator.Writer<>(st::setCarrier),
                ServiceResponseStatus.CARRIER_NOT_FOUND
        ));
        // add icon
        batch.add(st -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(st.getIconUid(), applicationFileService::read),
                new AdditionalDataManipulator.Writer<>(st::setIcon),
                ServiceResponseStatus.IMAGE_NOT_FOUND
        ));
        return batch;
    }

    @Override
    public ShippingTariffRepository getRepository() {
        return shippingTariffRepository;
    }

}

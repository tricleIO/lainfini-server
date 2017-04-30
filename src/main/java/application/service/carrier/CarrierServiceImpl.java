package application.service.carrier;

import application.persistence.entity.Carrier;
import application.persistence.repository.CarrierRepository;
import application.rest.domain.CarrierDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import application.service.product.ApplicationFileService;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrierServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<Carrier, Integer, CarrierRepository, CarrierDTO> implements CarrierService {

    @Autowired
    private CarrierRepository carrierRepository;

    @Autowired
    ApplicationFileService applicationFileService;

    @Override
    protected AdditionalDataManipulatorBatch<CarrierDTO> getAdditionalDataLoaderBatch(CarrierDTO dto) {
        AdditionalDataManipulatorBatch<CarrierDTO> batch = new AdditionalDataManipulatorBatch<>(dto);
        batch.add(c -> new AdditionalDataManipulator<>(
                new AdditionalDataManipulator.Reader<>(c.getLogoUid(), applicationFileService::read),
                new AdditionalDataManipulator.Writer<>(c::setLogo),
                ServiceResponseStatus.IMAGE_NOT_FOUND
        ));
        return batch;
    }

    @Override
    public CarrierRepository getRepository() {
        return carrierRepository;
    }

}

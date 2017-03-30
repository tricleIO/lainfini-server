 package application.service.shippingAvailability;

 import application.persistence.entity.ShippingAvailability;
 import application.persistence.repository.ShippingAvailabilityRepository;
 import application.rest.domain.ShippingAvailabilityDTO;
 import application.service.AdditionalDataManipulator;
 import application.service.AdditionalDataManipulatorBatch;
 import application.service.BaseDatabaseServiceImpl;
 import application.service.response.ServiceResponseStatus;
 import application.service.shippingRegion.ShippingRegionService;
 import application.service.shippingTariff.ShippingTariffService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

 @Service
 public class ShippingAvailabilityServiceImpl extends BaseDatabaseServiceImpl<ShippingAvailability, Integer, ShippingAvailabilityRepository, ShippingAvailabilityDTO> implements ShippingAvailabilityService {

     @Autowired
     private ShippingAvailabilityRepository shippingAvailabilityRepository;

     @Autowired
     private ShippingTariffService shippingTariffService;

     @Autowired
     private ShippingRegionService shippingRegionService;

     @Override
     protected AdditionalDataManipulatorBatch<ShippingAvailabilityDTO> getAdditionalDataLoaderBatch(ShippingAvailabilityDTO dto) {
         AdditionalDataManipulatorBatch<ShippingAvailabilityDTO> batch = new AdditionalDataManipulatorBatch<>(dto);
         // add carrier
         batch.add(sa -> new AdditionalDataManipulator<>(
                 new AdditionalDataManipulator.Reader<>(sa.getTariffUid(), shippingTariffService::read),
                 new AdditionalDataManipulator.Writer<>(sa::setTariff),
                 ServiceResponseStatus.SHIPPING_TARIFF_NOT_FOUND
         ));
         // add icon
         batch.add(sa -> new AdditionalDataManipulator<>(
                 new AdditionalDataManipulator.Reader<>(sa.getRegionUid(), shippingRegionService::read),
                 new AdditionalDataManipulator.Writer<>(sa::setRegion),
                 ServiceResponseStatus.SHIPPING_REGION_NOT_FOUND
         ));
         return batch;
     }

     @Override
     public ShippingAvailabilityRepository getRepository() {
         return shippingAvailabilityRepository;
     }

 }

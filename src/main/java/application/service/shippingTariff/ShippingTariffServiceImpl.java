package application.service.shippingTariff;

import application.persistence.entity.Currency;
import application.persistence.entity.ShippingAvailability;
import application.persistence.entity.ShippingTariff;
import application.persistence.repository.CurrencyRepository;
import application.persistence.repository.ShippingAvailabilityRepository;
import application.persistence.repository.ShippingTariffRepository;
import application.rest.domain.ShippingTariffDTO;
import application.service.AdditionalDataManipulator;
import application.service.AdditionalDataManipulatorBatch;
import application.service.BaseDatabaseServiceImpl;
import application.service.carrier.CarrierService;
import application.service.product.ApplicationFileService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ShippingTariffServiceImpl extends BaseDatabaseServiceImpl<ShippingTariff, Integer, ShippingTariffRepository, ShippingTariffDTO> implements ShippingTariffService {

    @Autowired
    private ShippingTariffRepository shippingTariffRepository;

    @Autowired
    private CarrierService carrierService;

    @Autowired
    private ApplicationFileService applicationFileService;

    @Autowired
    private ShippingAvailabilityRepository shippingAvailabilityRepository;

    @Autowired
    private CurrencyRepository currencyRepository;

    public ServiceResponse<Page<ShippingTariffDTO>> readByCountryId(Integer countryId, Pageable pageable) {
        Page<ShippingAvailability> availabilities = shippingAvailabilityRepository.findByRegionCountriesId(
                countryId, pageable
        );
        Page<ShippingTariff> tariffsPage = getShippingTariffs(pageable, availabilities);
        return ServiceResponse.success(convertPageWithEntitiesToPageWithDtos(tariffsPage, pageable));
    }

    public ServiceResponse<Page<ShippingTariffDTO>> readByCountryCode(String countryCode, Pageable pageable) {
        Page<ShippingAvailability> availabilities = shippingAvailabilityRepository.findByRegionCountriesCode(
                countryCode, pageable
        );
        Page<ShippingTariff> tariffsPage = getShippingTariffs(pageable, availabilities);
        return ServiceResponse.success(convertPageWithEntitiesToPageWithDtos(tariffsPage, pageable));
    }

    private Page<ShippingTariff> getShippingTariffs(Pageable pageable, Page<ShippingAvailability> availabilities) {
        List<ShippingTariff> tariffs = new LinkedList<>();
        for (ShippingAvailability availability : availabilities) {
            tariffs.add(availability.getTariff());
        }
        return new PageImpl<>(tariffs, pageable, tariffs.size());
    }

    @Override
    protected ServiceResponse<ShippingTariffDTO> doBeforeConvertInCreate(ShippingTariffDTO dto) {
        Currency currency = currencyRepository.findOne(dto.getCurrencyUid());
        if (currency == null) {
            return ServiceResponse.error(ServiceResponseStatus.CURRENCY_NOT_FOUND);
        }
        dto.setCurrency(currency.toDTO(true));
        return super.doBeforeConvertInCreate(dto);
    }

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

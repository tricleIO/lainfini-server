package application.service.shippingRegion;

import application.persistence.entity.Country;
import application.persistence.entity.ShippingRegion;
import application.persistence.repository.CountryRepository;
import application.persistence.repository.ShippingRegionRepository;
import application.rest.domain.CountryDTO;
import application.rest.domain.ShippingRegionDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingRegionServiceImpl extends BaseDatabaseServiceImpl<ShippingRegion, Integer, ShippingRegionRepository, ShippingRegionDTO> implements ShippingRegionService {

    @Autowired
    private ShippingRegionRepository shippingRegionRepository;

    @Autowired
    private CountryRepository countryRepository;

    public ServiceResponse<CountryDTO> addCountry(CountryDTO countryDTO) {
        ShippingRegion shippingRegion = shippingRegionRepository.findOne(countryDTO.getRegionUid());
        if (shippingRegion == null) {
            return ServiceResponse.error(ServiceResponseStatus.SHIPPING_REGION_NOT_FOUND);
        }
        Country foundCountry = countryRepository.findOne(countryDTO.getUid());
        Country savedCountry;
        if (foundCountry == null) {
            savedCountry = countryRepository.save(countryDTO.toEntity(true));
        } else {
            savedCountry = foundCountry;
        }
        shippingRegion.getCountries().add(savedCountry);
        shippingRegionRepository.save(shippingRegion);
        return ServiceResponse.success(savedCountry.toDTO(true));
    }

    @Override
    public ShippingRegionRepository getRepository() {
        return shippingRegionRepository;
    }

}

package application.service.shippingRegion;

import application.persistence.entity.Country;
import application.persistence.entity.ShippingRegion;
import application.persistence.repository.CountryRepository;
import application.persistence.repository.ShippingRegionRepository;
import application.rest.domain.CountryDTO;
import application.rest.domain.ShippingRegionDTO;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Service
public class ShippingRegionServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<ShippingRegion, Integer, ShippingRegionRepository, ShippingRegionDTO> implements ShippingRegionService {

    @Autowired
    private ShippingRegionRepository shippingRegionRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Override
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
    public ServiceResponse<Page<CountryDTO>> readCountries(Integer regionId) {
        ShippingRegion shippingRegion = shippingRegionRepository.findOne(regionId);
        if (shippingRegion == null) {
            return ServiceResponse.error(ServiceResponseStatus.SHIPPING_REGION_NOT_FOUND);
        }
        Set<Country> countries = shippingRegion.getCountries();
        List<CountryDTO> countryDTOList = new LinkedList<>();
        for (Country country : countries) {
            countryDTOList.add(country.toDTO(true));
        }
        return ServiceResponse.success(
                new PageImpl<>(countryDTOList, null, countryDTOList.size())
        );
    }


    @Override
    public ShippingRegionRepository getRepository() {
        return shippingRegionRepository;
    }

}

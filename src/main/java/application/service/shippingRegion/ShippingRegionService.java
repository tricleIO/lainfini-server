package application.service.shippingRegion;

import application.persistence.entity.ShippingRegion;
import application.rest.domain.CountryDTO;
import application.rest.domain.ShippingRegionDTO;
import application.service.BaseSoftDeletableDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;

public interface ShippingRegionService extends BaseSoftDeletableDatabaseService<ShippingRegion, Integer, ShippingRegionDTO> {

    ServiceResponse<CountryDTO> addCountry(CountryDTO countryDTO);
    ServiceResponse<Page<CountryDTO>> readCountries(Integer regionId);

}

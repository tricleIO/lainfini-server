package application.service.shippingRegion;

import application.persistence.entity.ShippingRegion;
import application.rest.domain.CountryDTO;
import application.rest.domain.ShippingRegionDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;

public interface ShippingRegionService extends BaseDatabaseService<ShippingRegion, Integer, ShippingRegionDTO> {

    ServiceResponse<CountryDTO> addCountry(CountryDTO countryDTO);

}

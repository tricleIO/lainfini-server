package application.service.shippingTariff;

import application.persistence.entity.ShippingTariff;
import application.rest.domain.ShippingTariffDTO;
import application.service.BaseSoftDeletableDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ShippingTariffService extends BaseSoftDeletableDatabaseService<ShippingTariff, Integer, ShippingTariffDTO> {

    ServiceResponse<Page<ShippingTariffDTO>> readByCountryId(Integer countryId, Pageable pageable);
    ServiceResponse<Page<ShippingTariffDTO>> readByCountryCode(String countryCode, Pageable pageable);

}

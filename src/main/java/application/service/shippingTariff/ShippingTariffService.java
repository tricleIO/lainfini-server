package application.service.shippingTariff;

import application.persistence.entity.ShippingTariff;
import application.rest.domain.ShippingTariffDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ShippingTariffService extends BaseDatabaseService<ShippingTariff, Integer, ShippingTariffDTO> {

    ServiceResponse<Page<ShippingTariffDTO>> readByCountryId(Integer countryId, Pageable pageable);
    ServiceResponse<Page<ShippingTariffDTO>> readByCountryCode(String countryCode, Pageable pageable);

}

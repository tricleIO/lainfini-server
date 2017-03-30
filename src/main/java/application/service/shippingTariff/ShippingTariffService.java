package application.service.shippingTariff;

import application.persistence.entity.ShippingTariff;
import application.rest.domain.ShippingTariffDTO;
import application.service.BaseDatabaseService;

public interface ShippingTariffService extends BaseDatabaseService<ShippingTariff, Integer, ShippingTariffDTO> {

}

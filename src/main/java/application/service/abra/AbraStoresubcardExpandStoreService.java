package application.service.abra;

import application.rest.domain.ProductAvailabilityDTO;
import application.service.response.ServiceResponse;

import java.util.UUID;

/**
 * Created by pfilip on 6.4.17.
 */
public interface AbraStoresubcardExpandStoreService {

    ServiceResponse<ProductAvailabilityDTO> checkProductAvailability(UUID uuid);
}

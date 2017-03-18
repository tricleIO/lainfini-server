package application.service.address;

import application.persistence.entity.Address;
import application.rest.domain.AddressDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface AddressService extends BaseDatabaseService<Address, Long, AddressDTO> {

    ServiceResponse<Page<AddressDTO>> readCustomerAddresses(UUID customerId, Pageable pageable);

}

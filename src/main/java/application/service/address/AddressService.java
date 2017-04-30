package application.service.address;

import application.persistence.entity.Address;
import application.rest.domain.AddressDTO;
import application.service.BaseSoftDeletableDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface AddressService extends BaseSoftDeletableDatabaseService<Address, Long, AddressDTO> {

    ServiceResponse<Page<AddressDTO>> readCustomerAddresses(UUID customerId, Pageable pageable);

}

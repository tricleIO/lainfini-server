package application.service.address;

import application.persistence.entity.Address;
import application.rest.domain.AddressDTO;
import application.service.BaseDatabaseService;

public interface AddressService extends BaseDatabaseService<Address, Long, AddressDTO> {

}

package application.service.address;

import application.persistence.entity.Address;
import application.rest.domain.AddressDTO;
import application.service.DatabaseServiceInterface;

public interface AddressService extends DatabaseServiceInterface<Address, Long, AddressDTO> {

}

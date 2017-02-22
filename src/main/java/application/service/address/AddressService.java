package application.service.address;

import application.persistence.entity.Address;
import application.persistence.entity.Customer;
import application.rest.domain.AddressDTO;
import application.rest.domain.CustomerDTO;
import application.service.DatabaseServiceInterface;

public interface AddressService extends DatabaseServiceInterface<Address, Long, AddressDTO> {

}

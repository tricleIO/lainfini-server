package application.service.address;

import application.persistence.entity.Address;
import application.persistence.repository.AddressRepository;
import application.rest.domain.AddressDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends BaseDatabaseServiceImpl<Address, Long, AddressRepository, AddressDTO> implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public AddressRepository getRepository() {
        return addressRepository;
    }

}

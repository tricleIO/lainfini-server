package application.rest;

import application.persistence.entity.Address;
import application.rest.domain.AddressDTO;
import application.rest.domain.CustomerDTO;
import application.service.address.AddressService;
import application.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/addresses")
public class AddressController extends AbstractDatabaseController<Address, Long, AddressDTO, AddressService> {

    @Autowired
    private AddressService addressService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readAddresses(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readAddress(@PathVariable Long id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createAddress(@RequestBody AddressDTO address) {
        return create(address);
    }

    @Override
    public AddressService getBaseService() {
        return addressService;
    }

}
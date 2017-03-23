package application.rest;

import application.persistence.entity.Address;
import application.rest.domain.AddressDTO;
import application.service.address.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class AddressController extends AbstractDatabaseController<Address, Long, AddressDTO, AddressService> {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/customers/{userId}/addresses", method = RequestMethod.GET)
    public ResponseEntity<?> readAddresses(@PathVariable UUID userId, Pageable pageable) {
        return getPageResponseEntity(
                addressService.readCustomerAddresses(userId, pageable)
        );
    }

    @RequestMapping(value = "/addresses/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readAddress(@PathVariable Long id) {
        return read(id);
    }

    @RequestMapping(value = "/customers/{userId}/addresses", method = RequestMethod.POST)
    public ResponseEntity<?> createAddress(@PathVariable UUID userId, @RequestBody AddressDTO address) {
        address.setCustomerUid(userId);
        return create(address);
    }

    @Override
    public AddressService getBaseService() {
        return addressService;
    }

}
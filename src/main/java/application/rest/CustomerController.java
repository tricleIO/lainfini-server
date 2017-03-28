package application.rest;

import application.persistence.entity.User;
import application.rest.domain.UserDTO;
import application.service.user.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController extends AbstractDatabaseController<User, UUID, UserDTO, CustomerService> {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCustomers(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCustomer(@PathVariable UUID id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCustomer(@RequestBody UserDTO user) {
        return create(user);
    }

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public ResponseEntity<?> readCurrentCustomer() {
        return getSimpleResponseEntity(
                customerService.readCurrentUser()
        );
    }

    @RequestMapping(value = "/password-reset", method = RequestMethod.POST)
    public ResponseEntity<?> resetPassword(@RequestParam(name = "email") String email) {
        return getSimpleResponseEntity(
                customerService.resetUserPassword(email)
        );
    }

    @Override
    public CustomerService getBaseService() {
        return customerService;
    }

}
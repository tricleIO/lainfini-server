package application.rest;

import application.persistence.entity.User;
import application.rest.domain.UserDTO;
import application.service.user.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController extends AbstractDatabaseController<User, UUID, UserDTO, CustomerService> {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readUsers(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody UserDTO user) {
        return create(user);
    }

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public ResponseEntity<?> readCurrentUser() {
        return getSimpleResponseEntity(
                customerService.readCurrentUser()
        );
    }

    @Override
    public CustomerService getBaseService() {
        return customerService;
    }

}
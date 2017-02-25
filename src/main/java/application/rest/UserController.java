package application.rest;

import application.persistence.entity.User;
import application.rest.AbstractDatabaseController;
import application.rest.domain.UserDTO;
import application.service.customer.CustomerService;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController extends AbstractDatabaseController<User, Long, UserDTO, UserService> {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readUsers(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readUser(@PathVariable Long id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody UserDTO user) {
        return create(user);
    }

    @Override
    public UserService getBaseService() {
        return userService;
    }

}
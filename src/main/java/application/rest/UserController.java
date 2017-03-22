package application.rest;

import application.persistence.entity.User;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.UserDTO;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/users")
public class UserController extends AbstractDatabaseController<User, UUID, UserDTO, UserService> {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readUsers(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readUser(@PathVariable UUID id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody UserDTO user) {
        return create(user);
    }

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public ResponseEntity<?> readCurrentUser() {
        return getSimpleResponseEntity(
                userService.readCurrentUser()
        );
    }

    @RequestMapping(value = "/verify", method = RequestMethod.GET)
    public ResponseEntity<?> verifyUser(@RequestParam String verificationToken) {
        UserDTO body = userService.findByEmailVerificationTokenToken(verificationToken).getBody();
        if (body != null) {
//            Date expiryDate = body.toEntity(true).getEmailVerificationToken().getExpiryDate();
            body.setRegisterStatus(UserStatusEnum.REGISTERED);
            userService.patch(body);
            return new ResponseEntity<>(
                    HttpStatus.OK
            );
        }

        return new ResponseEntity<>(
                "Token not found",
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @Override
    public UserService getBaseService() {
        return userService;
    }

}
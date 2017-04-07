package application.rest;

import application.persistence.entity.User;
import application.persistence.repository.UserRepository;
import application.persistence.type.UserRoleEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.UserDTO;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/users")
public class UserController extends AbstractDatabaseController<User, UUID, UserDTO, UserService> {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailsService userDetailsService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readUsers(Pageable pageable) {
        // has logged user demanded roles
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // error
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        // then read
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

    @RequestMapping(value = "/password-reset", method = RequestMethod.POST)
    public ResponseEntity<?> resetPassword(@RequestParam(name = "email") String email) {
        return getSimpleResponseEntity(
                userService.resetUserPassword(email)
        );
    }

    @RequestMapping(value = "/verify", method = RequestMethod.GET)
    public ResponseEntity<?> verifyUser(@RequestParam String verificationToken) {
//            Date expiryDate = body.toEntity(true).getEmailVerificationToken().getExpiryDate(); //todo: brát v potaz expiraci
        User user = userRepository.findByEmailVerificationTokenToken(verificationToken);
        if (user == null) {
            return new ErrorResponseEntity(ServiceResponseStatus.CUSTOMER_NOT_FOUND);
        }
        if (user.getRegisterStatus() == UserStatusEnum.PRE_REGISTERED) {
            user.setRegisterStatus(UserStatusEnum.REGISTERED);
            userRepository.save(user);
        }
        return new ResponseEntity<>(
                HttpStatus.OK
        );
    }

    @Override
    public UserService getBaseService() {
        return userService;
    }

}
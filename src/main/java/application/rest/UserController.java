package application.rest;

import application.persistence.entity.User;
import application.persistence.type.UserRoleEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.UserDTO;
import application.service.response.ServiceResponse;
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

    @RequestMapping(value = "/verify", method = RequestMethod.GET)
    public ResponseEntity<?> verifyUser(@RequestParam String verificationToken) {
        UserDTO body = userService.findByEmailVerificationTokenToken(verificationToken).getBody();
        if (body != null) {
            if (body.getRegisterStatus().equals(UserStatusEnum.REGISTERED)) {
                return new ResponseEntity<>(
                        HttpStatus.OK
                );
            } else if (body.getRegisterStatus().equals(UserStatusEnum.PRE_REGISTERED)) {
//            Date expiryDate = body.toEntity(true).getEmailVerificationToken().getExpiryDate(); //todo: brát v potaz expiraci
                body.setRegisterStatus(UserStatusEnum.REGISTERED);
                userService.patch(body); //todo: tady dát lepší patch, aby nemazal heslo
                return new ResponseEntity<>(
                        HttpStatus.OK
                );
            }
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
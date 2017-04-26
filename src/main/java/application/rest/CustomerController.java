package application.rest;

import application.persistence.entity.User;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.UserDTO;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.CustomerService;
import application.service.user.UserService;
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

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCustomers(Pageable pageable) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCustomer(@PathVariable UUID id) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(id);
        if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
        }
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

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> patchCustomer(@PathVariable UUID id, @RequestBody UserDTO userDTO) {
        ServiceResponse<Boolean> hasRolesResponse = customerService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        ServiceResponse<Boolean> isCurrentUserResponse = customerService.isCurrrentUser(id);
        if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
        }
        userDTO.setUid(id);
        return patch(userDTO);
    }

    @RequestMapping(value = "/password-reset", method = RequestMethod.POST)
    public ResponseEntity<?> resetPassword(@RequestBody UserDTO userDTO) {
        return getSimpleResponseEntity(
                customerService.resetUserPassword(userDTO.getEmail())
        );
    }

    @Override
    public CustomerService getBaseService() {
        return customerService;
    }

}
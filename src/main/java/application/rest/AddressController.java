package application.rest;

import application.persistence.entity.Address;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.AddressDTO;
import application.service.address.AddressService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class AddressController extends AbstractDatabaseController<Address, Long, AddressDTO, AddressService> {

    @Autowired
    private AddressService addressService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/customers/{userId}/addresses", method = RequestMethod.GET)
    public ResponseEntity<?> readAddresses(@PathVariable UUID userId, Pageable pageable) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(userId);
        if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
        }
        return getPageResponseEntity(
                addressService.readCustomerAddresses(userId, pageable)
        );
    }

    @RequestMapping(value = "/addresses/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readAddress(@PathVariable Long id) {
        ServiceResponse<AddressDTO> response = addressService.read(id);
        if (response.isSuccessful()) {
            ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                    UserRoleEnum.ROLE_ADMIN
            );
            ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(
                    response.getBody().getCustomerUid()
            );
            if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
                return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
            }
        }
        return getSimpleResponseEntity(response);
    }

    @RequestMapping(value = "/customers/{userId}/addresses", method = RequestMethod.POST)
    public ResponseEntity<?> createAddress(@PathVariable UUID userId, @RequestBody AddressDTO address) {
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(userId);
        if (!isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(isCurrentUserResponse.getStatus());
        }
        address.setCustomerUid(userId);
        return create(address);
    }

    @Override
    public AddressService getBaseService() {
        return addressService;
    }

}
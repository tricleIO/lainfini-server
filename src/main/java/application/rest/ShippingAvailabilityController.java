package application.rest;

import application.persistence.entity.ShippingAvailability;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.ShippingAvailabilityDTO;
import application.service.response.ServiceResponse;
import application.service.shippingAvailability.ShippingAvailabilityService;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shipping/availabilities")
public class ShippingAvailabilityController extends AbstractDatabaseController<ShippingAvailability, Integer, ShippingAvailabilityDTO, ShippingAvailabilityService> {

    @Autowired
    private ShippingAvailabilityService shippingAvailabilityService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readAvailabilities(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readAvailability(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addAvailability(@RequestBody ShippingAvailabilityDTO ShippingAvailabilityDTO) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(ShippingAvailabilityDTO);
    }

    @Override
    public ShippingAvailabilityService getBaseService() {
        return shippingAvailabilityService;
    }

}
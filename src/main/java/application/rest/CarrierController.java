package application.rest;

import application.persistence.entity.Carrier;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.CarrierDTO;
import application.service.carrier.CarrierService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "shipping/carriers")
public class CarrierController extends AbstractDatabaseController<Carrier, Integer, CarrierDTO, CarrierService> {

    @Autowired
    private CarrierService carrierService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCarriers(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCarrier(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCarrier(@RequestBody CarrierDTO carrierDTO) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(carrierDTO);
    }

    @Override
    public CarrierService getBaseService() {
        return carrierService;
    }

}
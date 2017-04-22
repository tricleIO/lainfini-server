package application.rest;

import application.persistence.entity.Delivery;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.ShippingDTO;
import application.service.delivery.DeliveryService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shipping")
public class ShippingController extends AbstractDatabaseController<Delivery, Long, ShippingDTO, DeliveryService> {

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readShipping(Pageable pageable) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readShipping(@PathVariable Long id) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return read(id);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<?> createShipping(@RequestBody ShippingDTO shippingDTO) {
//        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
//                UserRoleEnum.ROLE_ADMIN
//        );
//        if (!hasRolesResponse.isSuccessful()) {
//            return new ErrorResponseEntity(hasRolesResponse.getStatus());
//        }
//        return create(shippingDTO);
//    }

    @Override
    public DeliveryService getBaseService() {
        return deliveryService;
    }

}
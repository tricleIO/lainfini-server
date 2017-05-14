package application.rest;

import application.persistence.entity.CallToAction;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.CallDTO;
import application.rest.domain.GoodTasteCallDTO;
import application.service.response.ServiceResponse;
import application.service.soldItemsCall.CallToActionService;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/calls")
public class CallToActionController extends AbstractDatabaseController<CallToAction, Integer, CallDTO, CallToActionService> {

    @Autowired
    private CallToActionService soldItemsCallService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readAddresses(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readAddress(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(value = "/soldItems", method = RequestMethod.POST)
    public ResponseEntity<?> createSoldItems(@RequestBody GoodTasteCallDTO soldItemsCallDTO) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(soldItemsCallDTO);
    }

    @Override
    public CallToActionService getBaseService() {
        return soldItemsCallService;
    }

}
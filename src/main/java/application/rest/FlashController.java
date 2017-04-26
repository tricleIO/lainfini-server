package application.rest;

import application.persistence.entity.Flash;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.FlashDTO;
import application.service.flash.FlashService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/flashes")
public class FlashController extends AbstractDatabaseController<Flash, Integer, FlashDTO, FlashService> {

    @Autowired
    private FlashService flashService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readFlashes(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readFlash(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createFlash(@RequestBody FlashDTO address) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(address);
    }

    @Override
    public FlashService getBaseService() {
        return flashService;
    }

}
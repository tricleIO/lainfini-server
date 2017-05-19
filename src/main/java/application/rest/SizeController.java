package application.rest;

import application.persistence.entity.Size;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.SizeDTO;
import application.service.response.ServiceResponse;
import application.service.size.SizeService;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sizes")
public class SizeController extends AbstractDatabaseController<Size, Integer, SizeDTO, SizeService> {

    @Autowired
    private SizeService sizeService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readSizes(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readSize(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createSize(@RequestBody SizeDTO sizeDTO) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(sizeDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> patchSize(@PathVariable Integer id, @RequestBody SizeDTO sizeDTO) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        sizeDTO.setUid(id);
        return patch(sizeDTO);
    }

    @Override
    public SizeService getBaseService() {
        return sizeService;
    }

}
package application.rest;

import application.persistence.entity.ComplaintReason;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.ComplaintReasonDTO;
import application.service.complaintReason.ComplaintReasonService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/complaintReasons")
public class ComplaintReasonController extends AbstractDatabaseController<ComplaintReason, Integer, ComplaintReasonDTO, ComplaintReasonService> {

    @Autowired
    private ComplaintReasonService complaintReasonService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readReasons(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readReason(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createReason(@RequestBody ComplaintReasonDTO complaintReasonDTO) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(complaintReasonDTO);
    }

    @Override
    public ComplaintReasonService getBaseService() {
        return complaintReasonService;
    }

}
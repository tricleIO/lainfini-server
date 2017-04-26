package application.rest;

import application.persistence.entity.Complaint;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.ComplaintDTO;
import application.service.complaint.ComplaintService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/complaints")
public class ComplaintController extends AbstractDatabaseController<Complaint, UUID, ComplaintDTO, ComplaintService> {

    @Autowired
    private ComplaintService complaintService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readComplaints(Pageable pageable) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readComplaint(@PathVariable UUID id) {
        ServiceResponse<ComplaintDTO> response = complaintService.read(id);
        if (response.isSuccessful()) {
            ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                    UserRoleEnum.ROLE_ADMIN
            );
            ComplaintDTO complaintDTO = response.getBody();
            if (complaintDTO.getCustomerUid() == null) {
                if (!hasRolesResponse.isSuccessful()) {
                    return new ErrorResponseEntity(hasRolesResponse.getStatus());
                }
            } else {
                // is admin
                // or its his
                ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(
                        complaintDTO.getCustomerUid()
                );
                if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
                    return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
                }
            }
        }
        return getSimpleResponseEntity(response);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createComplaint(@RequestBody ComplaintDTO complaintDTO) {
        return create(complaintDTO);
    }

    @Override
    public ComplaintService getBaseService() {
        return complaintService;
    }

}
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class CustomerComplaintController extends AbstractDatabaseController<Complaint, UUID, ComplaintDTO, ComplaintService> {

    @Autowired
    private ComplaintService complaintService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/customers/{userId}/complaints", method = RequestMethod.GET)
    public ResponseEntity<?> readComplaints(@PathVariable UUID userId, Pageable pageable) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(userId);
        if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
        }
        return getPageResponseEntity(
                complaintService.readCustomerComplaints(userId, pageable)
        );
    }

    @Override
    public ComplaintService getBaseService() {
        return complaintService;
    }

}
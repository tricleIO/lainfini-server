package application.rest;

import application.persistence.entity.Complaint;
import application.rest.domain.ComplaintDTO;
import application.service.complaint.ComplaintService;
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

    @RequestMapping(value = "/customers/{userId}/complaints", method = RequestMethod.GET)
    public ResponseEntity<?> readComplaints(@PathVariable UUID userId, Pageable pageable) {
        return getPageResponseEntity(
                complaintService.readCustomerComplaints(userId, pageable)
        );
    }

    @Override
    public ComplaintService getBaseService() {
        return complaintService;
    }

}
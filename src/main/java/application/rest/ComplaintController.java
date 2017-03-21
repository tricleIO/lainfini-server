package application.rest;

import application.persistence.entity.Complaint;
import application.rest.domain.ComplaintDTO;
import application.service.complaint.ComplaintService;
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

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readComplaints(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readComplaint(@PathVariable UUID id) {
        return read(id);
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
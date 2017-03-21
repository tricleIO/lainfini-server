package application.rest;

import application.persistence.entity.ComplaintReason;
import application.rest.domain.ComplaintReasonDTO;
import application.service.complaintReason.ComplaintReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/complaintReasons")
public class ComplaintReasonController extends AbstractDatabaseController<ComplaintReason, Integer, ComplaintReasonDTO, ComplaintReasonService> {

    @Autowired
    private ComplaintReasonService complaintReasonService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readMaterials(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readMaterial(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createMaterial(@RequestBody ComplaintReasonDTO complaintReasonDTO) {
        return create(complaintReasonDTO);
    }

    @Override
    public ComplaintReasonService getBaseService() {
        return complaintReasonService;
    }

}
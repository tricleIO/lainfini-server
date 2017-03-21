package application.service.complaint;

import application.persistence.entity.Complaint;
import application.rest.domain.ComplaintDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ComplaintService extends BaseDatabaseService<Complaint, UUID, ComplaintDTO> {

    ServiceResponse<Page<ComplaintDTO>> readCustomerComplaints(UUID customerId, Pageable pageable);

}

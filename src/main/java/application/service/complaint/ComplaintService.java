package application.service.complaint;

import application.persistence.entity.Complaint;
import application.rest.domain.ComplaintDTO;
import application.service.BaseDatabaseService;

import java.util.UUID;

public interface ComplaintService extends BaseDatabaseService<Complaint, UUID, ComplaintDTO> {

}

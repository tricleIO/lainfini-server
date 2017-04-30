package application.service.complaintReason;

import application.persistence.entity.ComplaintReason;
import application.rest.domain.ComplaintReasonDTO;
import application.service.BaseSoftDeletableDatabaseService;

public interface ComplaintReasonService extends BaseSoftDeletableDatabaseService<ComplaintReason, Integer, ComplaintReasonDTO> {

}

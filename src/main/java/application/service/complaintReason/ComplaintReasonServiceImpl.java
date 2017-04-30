package application.service.complaintReason;

import application.persistence.entity.ComplaintReason;
import application.persistence.repository.ComplaintReasonRepository;
import application.rest.domain.ComplaintReasonDTO;
import application.service.BaseSoftDeletableDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintReasonServiceImpl extends BaseSoftDeletableDatabaseServiceImpl<ComplaintReason, Integer, ComplaintReasonRepository, ComplaintReasonDTO> implements ComplaintReasonService {

    @Autowired
    private ComplaintReasonRepository complaintReasonRepository;

    @Override
    public ComplaintReasonRepository getRepository() {
        return complaintReasonRepository;
    }

}

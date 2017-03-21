package application.persistence.repository;

import application.persistence.entity.ComplaintReason;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ComplaintReasonRepository extends PagingAndSortingRepository<ComplaintReason, Integer> {

}
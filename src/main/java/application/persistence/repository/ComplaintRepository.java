package application.persistence.repository;

import application.persistence.entity.Complaint;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface ComplaintRepository extends PagingAndSortingRepository<Complaint, UUID> {

}
package application.persistence.repository;

import application.persistence.entity.Complaint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface ComplaintRepository extends PagingAndSortingRepository<Complaint, UUID> {

    Page<Complaint> findByCustomerId(UUID customerId, Pageable pageable);

}
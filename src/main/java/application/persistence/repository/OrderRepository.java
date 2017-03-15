package application.persistence.repository;

import application.persistence.entity.CustomerOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface OrderRepository extends PagingAndSortingRepository<CustomerOrder, UUID> {

    Page<CustomerOrder> findByCustomerId(UUID customerId, Pageable pageable);

}
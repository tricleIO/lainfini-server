package application.persistence.repository;

import application.persistence.entity.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {

    Page<Address> findByCustomerId(UUID customerId, Pageable pageable);

}
package application.persistence.repository;

import application.persistence.entity.Address;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {

}
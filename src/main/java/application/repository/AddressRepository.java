package application.repository;

import application.entity.Address;
import application.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
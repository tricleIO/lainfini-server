package application.service.customer;

import application.persistence.entity.Customer;
import application.rest.domain.CustomerDTO;
import application.service.DatabaseServiceInterface;

public interface CustomerService extends DatabaseServiceInterface<Customer, Long, CustomerDTO> {

}

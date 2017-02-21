package application.service.customer;

import application.rest.domain.CustomerDTO;
import application.service.DatabaseServiceInterface;

public interface CustomerService extends DatabaseServiceInterface<Long, CustomerDTO> {

}

package application.service.customer;

import application.api.ServiceResponse;
import application.service.DatabaseServiceInterface;
import application.service.domain.CustomerDetails;

public interface CustomerService extends DatabaseServiceInterface<Long, CustomerDetails> {

    ServiceResponse<CustomerDetails> readCustomer(Long customerRepository);

}

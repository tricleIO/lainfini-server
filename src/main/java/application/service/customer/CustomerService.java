package application.service.customer;

import application.api.ServiceResponse;
import application.service.domain.CustomerDetails;

public interface CustomerService {

    ServiceResponse<CustomerDetails> readCustomer(Long customerRepository);

}

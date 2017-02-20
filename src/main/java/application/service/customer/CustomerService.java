package application.service.customer;

import application.api.customer.ReadCustomerByIdRequest;
import application.api.ServiceResponse;
import application.service.domain.CustomerDetails;

public interface CustomerService {

    ServiceResponse<CustomerDetails> readCustomer(ReadCustomerByIdRequest readCustomerByIdRequest);

}

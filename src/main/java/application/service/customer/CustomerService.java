package application.service.customer;

import application.api.customer.ReadCustomerByIdRequest;
import application.api.customer.Response;
import application.service.domain.CustomerDetails;

public interface CustomerService {

    Response<CustomerDetails> readCustomer(ReadCustomerByIdRequest readCustomerByIdRequest);

}

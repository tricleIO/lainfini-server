package application.service.customer;

import application.api.customer.ReadCustomerByIdRequest;
import application.persistence.entity.Customer;


public interface CustomerService {

    Customer readCustomer(ReadCustomerByIdRequest readCustomerByIdRequest);

}

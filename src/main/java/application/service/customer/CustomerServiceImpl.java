package application.service.customer;

import application.api.customer.ReadCustomerByIdRequest;
import application.persistence.entity.Customer;
import application.persistence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer readCustomer(ReadCustomerByIdRequest readCustomerByIdRequest) {
        return customerRepository.findOne(
                readCustomerByIdRequest.id
        );
    }

}

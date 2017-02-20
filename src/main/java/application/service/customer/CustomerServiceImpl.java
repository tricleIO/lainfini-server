package application.service.customer;

import application.api.customer.ReadCustomerByIdRequest;
import application.persistence.entity.Customer;
import application.persistence.repository.CustomerRepository;
import application.service.domain.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDetails readCustomer(ReadCustomerByIdRequest readCustomerByIdRequest) {
        Customer customer = customerRepository.findOne(
                readCustomerByIdRequest.id
        );
        if (customer != null) {
            return customer.toDetails();
        }
        return null;
    }

}

package application.service.customer;

import application.api.Status;
import application.api.ServiceResponse;
import application.persistence.entity.Customer;
import application.persistence.repository.CustomerRepository;
import application.service.AbstractDatabaseService;
import application.service.domain.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends AbstractDatabaseService<Customer, Long, CustomerRepository, CustomerDetails> implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public ServiceResponse<CustomerDetails> readCustomer(Long customerId) {
        Customer customer = customerRepository.findOne(
                customerId
        );
        if (customer != null) {
            return ServiceResponse.success(customer.toDetails());
        }
        return ServiceResponse.error(Status.NOT_FOUND);
    }

    @Override
    public CustomerRepository getRepository() {
        return customerRepository;
    }

}

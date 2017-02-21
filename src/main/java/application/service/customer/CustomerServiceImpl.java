package application.service.customer;

import application.service.response.Status;
import application.service.response.ServiceResponse;
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

    @Override
    public CustomerRepository getRepository() {
        return customerRepository;
    }

}

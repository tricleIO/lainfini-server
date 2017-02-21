package application.service.customer;

import application.rest.domain.CustomerDTO;
import application.persistence.entity.Customer;
import application.persistence.repository.CustomerRepository;
import application.service.AbstractDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends AbstractDatabaseService<Customer, Long, CustomerRepository, CustomerDTO> implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerRepository getRepository() {
        return customerRepository;
    }

}

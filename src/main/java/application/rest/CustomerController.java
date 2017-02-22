package application.rest;

import application.persistence.entity.Customer;
import application.rest.domain.CustomerDTO;
import application.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController extends AbstractDatabaseController<Customer, Long, CustomerDTO, CustomerService> {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCustomers() {
        return readAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCustomer(@PathVariable Long id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCustomer(@RequestBody CustomerDTO customer) {
        return create(customer);
    }

    @Override
    public CustomerService getBaseService() {
        return customerService;
    }

}
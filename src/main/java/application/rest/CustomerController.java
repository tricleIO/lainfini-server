package application.rest;

import application.rest.domain.CustomerDTO;
import application.service.customer.CustomerService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCustomer() {
        ServiceResponse<?> response = customerService.readAll();
        return new ResponseEntity<>(
                response.getBody(),
                HttpStatus.OK
        );
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCustomer(@RequestBody CustomerDTO customer) {
        ServiceResponse<?> response = customerService.create(customer);
        return new ResponseEntity<>(
                response.getBody(),
                HttpStatus.OK
        );
    }

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<?> readCustomer(@PathVariable Long customerId) {
        ServiceResponse<CustomerDTO> response = customerService.read(
                customerId
        );
        if (response.isSuccessful()) {
            return new ResponseEntity<>(
                    response.getBody(),
                    HttpStatus.OK
            );
        } else {
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND
            );
        }
    }

}
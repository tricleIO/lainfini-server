package application.rest.domain;

import application.persistence.entity.Customer;
import lombok.Data;

@Data
public class CustomerDTO implements EntityConvertable<Customer> {

    private Long id;
    private String firstName;
    private String lastName;

    private Long deliveryAddressId;
    private Long billingAddressId;

    @Override
    public Customer toEntity() {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        return customer;
    }
}

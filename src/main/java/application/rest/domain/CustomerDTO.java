package application.rest.domain;

import application.persistence.entity.Customer;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
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

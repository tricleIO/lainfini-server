package application.rest.domain;

import application.persistence.entity.Customer;
import application.rest.AddressController;
import application.rest.CustomerController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO extends ResourceSupport implements InputOutputDTO<Customer> {

    private Long uid;
    private String firstName;
    private String lastName;

    private Long deliveryAddressId;
    private Long billingAddressId;

    @Override
    public Customer toEntity() {
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        return customer;
    }

    @Override
    public void addLinks() {
        add(linkTo(methodOn(CustomerController.class).readCustomer(uid)).withSelfRel());
        if (billingAddressId != null) {
            add(linkTo(methodOn(AddressController.class).readAddress(billingAddressId)).withRel("billingAddress"));
        }
        if (deliveryAddressId != null) {
            add(linkTo(methodOn(AddressController.class).readAddress(deliveryAddressId)).withRel("deliveryAddress"));
        }
    }
}

package application.rest.domain;

import application.persistence.entity.User;
import application.rest.AddressController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO  extends ResourceSupport implements ReadWriteDatabaseDTO<User> {

    private Long uid;
    private String username;
    private String password;
    private Long customerId;

    private String firstName;
    private String lastName;

    private Long deliveryAddressId;
    private Long billingAddressId;

    @Override
    public User toEntity() {
        User user = new User();
        user.setId(uid);
        user.setLogin(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }

    @Override
    public void addLinks() {
        if (billingAddressId != null) {
            add(linkTo(methodOn(AddressController.class).readAddress(billingAddressId)).withRel("billingAddress"));
        }
        if (deliveryAddressId != null) {
            add(linkTo(methodOn(AddressController.class).readAddress(deliveryAddressId)).withRel("deliveryAddress"));
        }
    }

}

package application.rest.domain;

import application.persistence.entity.User;
import application.persistence.type.SexEnum;
import application.rest.AddressController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO extends ResourceSupport implements ReadWriteDatabaseDTO<User>, IdentifableDTO<Long> {

    private Long uid;
    private String username;
    private String password;
    private Long customerUid;

    private String firstName;
    private String lastName;

    private SexEnum sex;

    private Long deliveryAddressUid;
    private Long billingAddressUid;

    private String phoneCode;
    private String phoneNumber;

    private String abraLink;

    private CurrencyDTO currency;

    private String degreeBeforeName;
    private String degreeAfterName;

    @Override
    public User toEntity() {
        User user = new User();
        user.setId(uid);
        user.setLogin(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhoneCode(phoneCode);
        user.setPhoneNumber(phoneNumber);
        if (currency != null) {
            user.setCurrency(currency.toEntity());
        }
        if (sex != null) {
            user.setSex(sex);
        }
        user.setAbraLink(abraLink);
        user.setDegreeAfterName(degreeAfterName);
        user.setDegreeBeforeName(degreeBeforeName);
        return user;
    }

    @Override
    public void addLinks() {
        if (billingAddressUid != null) {
            add(linkTo(methodOn(AddressController.class).readAddress(billingAddressUid)).withRel("billingAddress"));
        }
        if (deliveryAddressUid != null) {
            add(linkTo(methodOn(AddressController.class).readAddress(deliveryAddressUid)).withRel("deliveryAddress"));
        }
    }

}

package application.rest.domain;

import application.persistence.entity.User;
import application.persistence.type.LocaleEnum;
import application.persistence.type.SexEnum;
import application.persistence.type.StatusEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.AddressController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO extends ResourceSupport implements ReadWriteDatabaseDTO<User>, IdentifableDTO<UUID> {

    private UUID uid;
    private String username;
    private String password;
    private Long customerUid;
    private StatusEnum status;

    private String firstName;
    private String lastName;

    private SexEnum sex;

    private Long deliveryAddressUid;
    private Long billingAddressUid;

    private String phoneCode;
    private String phoneNumber;

    private String abraLink;
    private String stripeToken;

    private CurrencyDTO currency;

    private String degreeBeforeName;
    private String degreeAfterName;

    private UserStatusEnum registerStatus;

    private LocaleEnum locale;

    @Override
    public User toEntity(boolean selectAsParent, Object... parentParams) {
        User user = new User();
        user.setId(uid);
        user.setLogin(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhoneCode(phoneCode);
        user.setPhoneNumber(phoneNumber);
        user.setStatus(StatusEnum.ACTIVE);
        if (currency != null) {
            user.setCurrency(currency.toEntity(false));
        }
        if (sex == null) {
            sex = SexEnum.UNKNOWN;
        }
        if (locale == null) {
            locale = LocaleEnum.NONE;
        }
        user.setSex(sex);
        user.setAbraLink(abraLink);
        user.setStripeToken(stripeToken);
        user.setDegreeAfterName(degreeAfterName);
        user.setDegreeBeforeName(degreeBeforeName);
        user.setRegisterStatus(registerStatus);
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

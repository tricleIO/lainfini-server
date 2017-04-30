package application.rest.domain;

import application.persistence.entity.Address;
import application.persistence.type.StatusEnum;
import application.rest.AddressController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Address>, IdentifableDTO<Long>, SoftDeletableDTO {

    private Long uid;
    private String street;
    private String houseNumber;
    private String city;
    private String postal;
    private String state;
    private String country;
    private UUID customerUid;
    private StatusEnum status;

    private UserDTO customer;

    @Override
    public Address toEntity(boolean selectAsParent, Object... parentParams) {
        Address address = new Address();
        address.setId(uid);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setCity(city);
        address.setPostalCode(postal);
        address.setState(state);
        address.setCountry(country);
        if (selectAsParent) {
            if (customer != null) {
                address.setCustomer(customer.toEntity(false));
            }
        }
        return address;
    }

    @Override
    public void addLinks() {
        add(linkTo(methodOn(AddressController.class).readAddress(uid)).withSelfRel());
    }

}

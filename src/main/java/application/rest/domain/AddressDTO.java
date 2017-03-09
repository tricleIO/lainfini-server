package application.rest.domain;

import application.persistence.entity.Address;
import application.rest.AddressController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Address>, IdentifableDTO<Long> {

    private Long uid;
    private String street;
    private int houseNumber;
    private String city;
    private String postal;
    private String state;
    private String country;

    @Override
    public Address toEntity() {
        Address address = new Address();
        address.setId(uid);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setCity(city);
        address.setPostalCode(postal);
        address.setState(state);
        address.setCountry(country);
        return address;
    }

    @Override
    public void addLinks() {
        add(linkTo(methodOn(AddressController.class).readAddress(uid)).withSelfRel());
    }


}

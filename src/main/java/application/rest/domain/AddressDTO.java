package application.rest.domain;

import application.persistence.entity.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO implements EntityConvertable<Address> {

    private Long id;
    private String street;
    private int houseNumber;
    private String city;
    private String postal;
    private String state;
    private String country;

    @Override
    public Address toEntity() {
        Address address = new Address();
        address.setId(id);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setCity(city);
        address.setPostal(postal);
        address.setState(state);
        address.setCountry(country);
        return address;
    }

}

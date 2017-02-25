package application.persistence.entity;

import application.rest.domain.AddressDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Address implements DTOConvertable<AddressDTO>, Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String street;
    private int houseNumber;
    private String city;
    private String postal;
    private String state;
    private String country;

    public Address() {
    }

    @Override
    public AddressDTO toDTO() {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setUid(id);
        addressDTO.setStreet(street);
        addressDTO.setHouseNumber(houseNumber);
        addressDTO.setCity(city);
        addressDTO.setPostal(postal);
        addressDTO.setState(state);
        addressDTO.setCountry(country);
        return addressDTO;
    }

}

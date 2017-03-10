package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.AddressDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
@Data
public class Address implements DTOConvertable<AddressDTO>, Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street", length = 255)
    private String street;

    @Column(name = "house_number")
    private int houseNumber;

    @Column(name = "city", length = 255)
    private String city;

    @Column(name = "postal_code", length = 12)
    private String postalCode;

    @Column(name = "state", length = 63)
    private String state;

    @Column(name = "country", length = 63)
    private String country;


    @Override
    public AddressDTO toDTO(boolean selectAsParent) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setUid(id);
        addressDTO.setStreet(street);
        addressDTO.setHouseNumber(houseNumber);
        addressDTO.setCity(city);
        addressDTO.setPostal(postalCode);
        addressDTO.setState(state);
        addressDTO.setCountry(country);
        return addressDTO;
    }

}

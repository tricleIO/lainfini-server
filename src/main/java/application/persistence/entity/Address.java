package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.AddressDTO;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
@Data
@ToString(exclude = {"customer"})
public class Address implements DTOConvertable<AddressDTO>, Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street", length = 255)
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "city", length = 255)
    private String city;

    @Column(name = "postal_code", length = 12)
    private String postalCode;

    @Column(name = "state", length = 63)
    private String state;

    @Column(name = "country", length = 63)
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private User customer;

    @Override
    public AddressDTO toDTO(boolean selectAsParent, Object... parentParams) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setUid(id);
        addressDTO.setStreet(street);
        addressDTO.setHouseNumber(houseNumber);
        addressDTO.setCity(city);
        addressDTO.setPostal(postalCode);
        addressDTO.setState(state);
        addressDTO.setCountry(country);
        if (customer != null) {
            addressDTO.setCustomerUid(customer.getId());
        }
        return addressDTO;
    }

}

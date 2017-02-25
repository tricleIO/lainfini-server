package application.persistence.entity;

import application.persistence.type.Currency;
import application.persistence.type.Locale;
import application.persistence.type.Sex;
import application.persistence.type.State;
import application.rest.domain.CustomerDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Customer implements DTOConvertable<CustomerDTO>, Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @OneToOne
    private Address billingAddress;

    @OneToOne
    private Address deliveryAddress;

    private String phoneCode;

    private String phoneNumber;

    private String abraLink;

    @Enumerated(EnumType.STRING)
    private State state;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Enumerated(EnumType.STRING)
    private Locale locale;

    public Customer() {}

    @Override
    public CustomerDTO toDTO() {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUid(id);
        customerDTO.setFirstName(firstName);
        customerDTO.setLastName(lastName);
        if (billingAddress != null) {
            customerDTO.setBillingAddressId(billingAddress.getId());
        }
        if (deliveryAddress != null) {
            customerDTO.setDeliveryAddressId(deliveryAddress.getId());
        }
        return customerDTO;
    }

}
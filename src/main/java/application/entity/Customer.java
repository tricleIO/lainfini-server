package application.entity;

import application.type.Currency;
import application.type.Sex;
import application.type.State;

import javax.persistence.*;

@Entity
public class Customer {

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

    protected Customer() {}

    public Customer(String firstName, String lastName, Address billingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}
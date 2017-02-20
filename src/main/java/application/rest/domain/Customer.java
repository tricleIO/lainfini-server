package application.rest.domain;

import application.service.domain.CustomerDetails;

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static Customer fromDetails(CustomerDetails customerDetails) {
        Customer customer = new Customer();
        customer.setId(customerDetails.getId());
        customer.setFirstName(customerDetails.getFirstName());
        customer.setLastName(customerDetails.getLastName());
        return customer;
    }
}

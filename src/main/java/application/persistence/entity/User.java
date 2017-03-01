/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.CurrencyEnum;
import application.persistence.type.LocaleEnum;
import application.persistence.type.SexEnum;
import application.persistence.type.StatusEnum;
import application.rest.domain.UserDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customer")
@Data
public class User implements DTOConvertable<UserDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "customer")
    private List<LinkedAccount> linkedAccountList;

    @Column(name = "degree_before_name")
    private String degreeBeforeName;

    @Column(name = "degree_after_name")
    private String degreeAfterName;

    @NotNull
    @Column(name = "first_name", length = 64, nullable = false)
    private String firstName;

    @NotNull
    @Column(name = "last_name", length = 64, nullable = false)
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex", length = 6)
    private SexEnum sex;

    @OneToOne
    @JoinColumn(name = "billing_address_id", referencedColumnName = "id")
    private Address billingAddress;

    @OneToOne
    @JoinColumn(name = "delivery_address_id", referencedColumnName = "id")
    private Address deliveryAddress;

    @Column(name = "phone_code", length = 5)
    private String phoneCode;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "abra_link")
    private String abraLink;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 15)
    private StatusEnum statusEnum;

    @Enumerated(EnumType.STRING)
    @Column(name="currency", length = 10)
    private CurrencyEnum currency;

    @Enumerated(EnumType.STRING)
    @Column(name = "locale", length = 10)
    private LocaleEnum locale;

    /*login part*/

    @NotNull
    @Column(unique = true, nullable = false)
    private String login;

    @NotNull
    @Column(name = "password", length = 64)
    private String password;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles = new HashSet<Role>();

    public User() {
    }

    public User(User user) {
        super();
        this.id = user.getId();
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.roles = user.getRoles();
    }

    @Override
    public UserDTO toDTO() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUid(id);
        userDTO.setUsername(login);
        userDTO.setFirstName(firstName);
        userDTO.setLastName(lastName);
        if (billingAddress != null) {
            userDTO.setBillingAddressId(billingAddress.getId());
        }
        if (deliveryAddress != null) {
            userDTO.setDeliveryAddressId(deliveryAddress.getId());
        }

        return userDTO;
    }

}

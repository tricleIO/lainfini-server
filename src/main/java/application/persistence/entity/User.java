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
import application.persistence.type.LocaleEnum;
import application.persistence.type.SexEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.UserDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Audited
@Entity
@Table(name = "customer")
@Data
@EqualsAndHashCode(exclude = {"addresses","wishes", "linkedAccountList"})
public class User extends SoftDeletableEntityImpl implements DTOConvertable<UserDTO>, SoftDeletableEntity, Serializable {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "degree_before_name")
    private String degreeBeforeName;

    @Column(name = "degree_after_name")
    private String degreeAfterName;

    @Column(name = "first_name", length = 64)
    private String firstName;

    @Column(name = "last_name", length = 64)
    private String lastName;

    @Column(name = "sex", length = 1)
    private String sex;

    @OneToOne(fetch = FetchType.EAGER)
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

    @NotAudited
    @Column(name = "stripe_customer_token")
    private String stripeToken;

    @NotAudited
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserEmailVerificationToken emailVerificationToken;

    @ManyToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;

    @Enumerated(EnumType.STRING)
    @Column(name = "locale", length = 10)
    private LocaleEnum locale;

    @NotAudited
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "customer")
    private Set<Wish> wishes;

    @NotAudited
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "customer")
    private Set<Address> addresses;

    /*login part*/

    @NotNull
    @Column(nullable = false)
    private String email;

    @NotAudited
    @Column(name = "password", length = 64)
    private String password;

    @NotAudited
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;

    @Column(name = "register_status")
    @Enumerated(EnumType.ORDINAL)
    private UserStatusEnum registerStatus;

    public User() {
    }

    public User(User user) {
        super();
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.roles = user.getRoles();
//        this.linkedAccountList = user.getLinkedAccountList();
        this.degreeBeforeName = user.getDegreeBeforeName();
        this.degreeAfterName = user.getDegreeAfterName();
        this.firstName =user.getFirstName();
        this.lastName = user.getLastName();
        this.sex = user.getSex().getValue();
        this.billingAddress= user.getBillingAddress();
        this.deliveryAddress = user.getDeliveryAddress();
        this.phoneCode = user.getPhoneCode();
        this.phoneNumber = user.getPhoneNumber();
        this.abraLink = user.getAbraLink();
        this.stripeToken = user.getStripeToken();
        this.status = user.getStatus();
        this.currency = user.getCurrency();
        this.locale = user.getLocale();
    }

    @Override
    public UserDTO toDTO(boolean selectAsParent, Object... parentParams) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUid(id);
        userDTO.setUsername(email);
        userDTO.setFirstName(firstName);
        userDTO.setLastName(lastName);
        userDTO.setStatus(status);
        userDTO.setSex(getSex());
        if (billingAddress != null) {
            userDTO.setBillingAddressUid(billingAddress.getId());
        }
        if (deliveryAddress != null) {
            userDTO.setDeliveryAddressUid(deliveryAddress.getId());
        }
        userDTO.setPhoneCode(phoneCode);
        userDTO.setPhoneNumber(phoneNumber);
        userDTO.setAbraLink(abraLink);
        userDTO.setStripeToken(stripeToken);
        if (currency != null) {
            userDTO.setCurrency(currency.toDTO(false));
        }

//        if (linkedAccountList != null && linkedAccountList.size() > 0) {
//            List<LinkedAccountDTO> linkedAccountDTOS = new ArrayList<>();
//            for (LinkedAccount linkedAccount : linkedAccountList) {
//                LinkedAccountDTO linkedAccountDTO = new LinkedAccountDTO();
//                linkedAccountDTO.setParty(linkedAccount.getParty());
//                linkedAccountDTOS.add(linkedAccountDTO);
//            }
//            userDTO.setLinkedAccounts(linkedAccountDTOS);
//        }
        userDTO.setDegreeAfterName(degreeAfterName);
        userDTO.setDegreeBeforeName(degreeBeforeName);
        userDTO.setRegisterStatus(registerStatus);
        return userDTO;
    }

    public SexEnum getSex () {
        return SexEnum.parseFromDB(this.sex);
    }

    public void setSex(SexEnum sex) {
        if (sex != null) {
            this.sex = sex.getValue();
        }
    }

}

package application.persistence.entity;

import application.persistence.type.AccountPartyEnum;
import application.persistence.type.StatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "linked_account")
@Data
@EqualsAndHashCode(exclude = {"customer"})
@ToString(exclude = {"customer", "facebookAccount", "instagramAccount"})
public class LinkedAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private User customer;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_party", length = 15)
    private AccountPartyEnum party;

    @OneToOne(mappedBy = "linkedAccount")
    private FacebookAccount facebookAccount;

    @OneToOne(mappedBy = "linkedAccount")
    private InstagramAccount instagramAccount;

    @Column(name = "account_status", length = 10)
    @Enumerated(EnumType.ORDINAL)
    private StatusEnum status;

    @Column(name = "valid_from")
    private Date validFrom;

    @Column(name = "valid_to")
    private Date validTo;


}

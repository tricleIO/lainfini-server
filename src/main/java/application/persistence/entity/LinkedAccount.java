package application.persistence.entity;

import application.persistence.type.AccountPartyEnum;
import application.persistence.type.StatusEnum;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "linked_account")
@Data
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

    @Column(name = "status", length = 10)
    private StatusEnum status;

    @Column(name = "linked_at")
    private Date linkedAt;

    @Column(name = "valid_from")
    private Date validFrom;

}

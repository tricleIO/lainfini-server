package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.AccountPartyEnum;
import application.persistence.type.StatusEnum;
import application.rest.domain.LinkedAccountDTO;
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
@ToString(exclude = {"customer", "facebookAccount", "instagramAccount", "googleAccount"})
public class LinkedAccount implements DTOConvertable<LinkedAccountDTO>, Serializable {

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

    @OneToOne(mappedBy = "linkedAccount", cascade = CascadeType.ALL)
    private FacebookAccount facebookAccount;

    @OneToOne(mappedBy = "linkedAccount", cascade = CascadeType.ALL)
    private InstagramAccount instagramAccount;

    @OneToOne(mappedBy = "linkedAccount", cascade = CascadeType.ALL)
    private GoogleAccount googleAccount;

    @Column(name = "account_status", length = 10)
    @Enumerated(EnumType.ORDINAL)
    private StatusEnum status;

    @Column(name = "valid_from", nullable = false)
    private Date validFrom = new Date();

    @Column(name = "valid_to")
    private Date validTo;

    @Override
    public LinkedAccountDTO toDTO(boolean selectAsParent, Object... parentParams) {
        LinkedAccountDTO linkedAccountDTO = new LinkedAccountDTO();
        linkedAccountDTO.setParty(this.party);
        return linkedAccountDTO;
    }
}

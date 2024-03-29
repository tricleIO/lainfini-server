package application.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Audited
@Entity
@Table(name = "la_facebook")
@Data
@EqualsAndHashCode(exclude = {"linkedAccount"})
@ToString(exclude = {"linkedAccount"})
public class FacebookAccount implements ILinkableAccount, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "facebook_id", nullable = false)
    private String facebookId;

    @NotNull
    @Column(name = "username", length = 128, nullable = false)
    private String username;

    @OneToOne
    @JoinColumn(name = "linked_account_id", referencedColumnName = "id")
    private LinkedAccount linkedAccount;

}

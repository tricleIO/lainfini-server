package application.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "la_facebook")
@Data
public class FacebookAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "facebook_id", nullable = false)
    private Long facebookId;

    @NotNull
    @Column(name = "username", length = 128, nullable = false)
    private String username;

    @Column(name = "token",length = 255)
    private String token;

    @OneToOne
    @JoinColumn(name = "linked_account_id", referencedColumnName = "id")
    private LinkedAccount linkedAccount;

}

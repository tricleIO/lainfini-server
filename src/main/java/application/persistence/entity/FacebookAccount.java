package application.persistence.entity;

import javax.persistence.*;

@Entity
public class FacebookAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long fbId;

    private String username;

    private String token;

    @OneToOne
    private LinkedAccount linkedAccount;

}

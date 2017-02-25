package application.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FacebookAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long fbId;

    private String username;

    private String token;

    @OneToOne
    private LinkedAccount linkedAccount;

}

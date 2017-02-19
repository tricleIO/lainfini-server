package application.model.entity;

import application.model.type.State;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AuthToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Customer customer;

    private String token;

    @OneToOne
    private AuthApp app;

    private String ip;

    private Date createdAt;

    private Date expiresAt;

    @OneToOne
    private Login login;

    @Enumerated(EnumType.STRING)
    private State state;

}

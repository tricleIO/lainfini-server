package application.persistence.entity;

import application.persistence.type.State;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class AuthToken implements Serializable {

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

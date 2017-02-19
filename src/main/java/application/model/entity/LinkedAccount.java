package application.model.entity;

import application.model.type.AccountParty;
import application.model.type.State;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LinkedAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Customer customer;

    @Enumerated(EnumType.STRING)
    private AccountParty party;

    private State state;

    private Date linkedAt;

}

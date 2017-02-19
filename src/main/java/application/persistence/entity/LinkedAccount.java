package application.persistence.entity;

import application.persistence.type.AccountParty;
import application.persistence.type.State;

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

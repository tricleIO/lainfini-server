package application.persistence.entity;

import application.persistence.type.AccountParty;
import application.persistence.type.State;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class LinkedAccount implements Serializable {

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

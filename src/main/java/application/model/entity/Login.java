package application.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private LinkedAccount serviceAccount;

    private Date loggedAt;

    private String loggedFrom;

    private String browser;

}

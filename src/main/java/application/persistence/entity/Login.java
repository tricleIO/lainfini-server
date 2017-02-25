package application.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private LinkedAccount serviceAccount;

    private Date loggedAt;

    private String loggedFrom;

    private String browser;

}

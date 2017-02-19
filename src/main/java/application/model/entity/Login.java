package application.model.entity;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private LinkedAccount serviceAccount;

    private LocalDateTime loggedAt;

    private String loggedFrom;

    private String browser;

}

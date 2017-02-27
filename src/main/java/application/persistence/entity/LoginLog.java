package application.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "login_log")
@Data
public class LoginLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "linked_account_id", referencedColumnName = "id", nullable = false)
    private LinkedAccount linkedAccount;

    @Column(name = "logged_at")
    private Date loggedAt;

    @Column(name = "logged_from")
    private String loggedFrom;

    @Column(name = "browser")
    private String browser;

}

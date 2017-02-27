package application.persistence.entity;

import application.persistence.type.StatusEnum;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "auth_token")
@Data
public class AuthToken implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private User customer;

    @Column(name = "token", length = 255)
    private String token;

    @OneToOne
    @JoinColumn(name = "app_id", referencedColumnName = "id")
    private AuthApp app;

    //for IPv6
    @Column(name = "ip_address", length = 45)
    private String ipAddress;

    @Column(name = "valid_from", nullable = false)
    private Date validFrom;

    @Column(name = "valid_to")
    private Date validTo;

    @OneToOne
    @JoinColumn(name = "login_log_id", referencedColumnName = "id")
    private LoginLog loginLog;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusEnum statusEnum;

}

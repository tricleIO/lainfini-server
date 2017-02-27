package application.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "auth_app")
@Data
public class AuthApp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "token", length = 255)
    private String token;

    @Column(name = "host", length = 128)
    private String host;

    @Column(name = "app_name", length = 64)
    private String appName;

    @Column(name = "valid_from", nullable = false)
    private Date validFrom;

    @Column(name = "valid_to")
    private Date validTo;

}

package application.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class FacebookAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long fbId;

    private String username;

    private String token;

    @OneToOne
    private LinkedAccount linkedAccount;

}

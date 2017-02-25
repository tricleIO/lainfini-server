package application.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class InstagramAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long instagramId;

    private String username;

    private String token;

    @OneToOne
    private LinkedAccount linkedAccount;

}

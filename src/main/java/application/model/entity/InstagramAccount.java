package application.model.entity;

import javax.persistence.*;

@Entity
public class InstagramAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long instagramId;

    private String username;

    private String token;

    @OneToOne
    private LinkedAccount linkedAccount;

}

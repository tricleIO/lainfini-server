package application.rest.domain;

import application.persistence.type.StatusEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by pfilip on 24.3.17.
 */
@Data
public class UserFacebookAccountDTO implements Serializable{

    private String id;

    private String first_name;

    private String middle_name;

    private String last_name;

    private String email;

    private String gender;

    private StatusEnum statusInSystem;

}

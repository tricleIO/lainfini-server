package application.rest.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by pfilip on 14.4.17.
 */
@Data
public class UserGoogleAccountDTO implements Serializable {

    private String id;

    private String email;

    private Boolean verified_email;

    private String name;

    private String given_name;

    private String family_name;

    private String gender;

    private String locale;


//    {
//        "id": "116759505775368690216",
//            "email": "mujfibi@gmail.com",
//            "verified_email": true,
//            "name": "Petr Filip",
//            "given_name": "Petr",
//            "family_name": "Filip",
//            "link": "https://plus.google.com/+PetrFilipTix",
//            "picture": "https://lh6.googleusercontent.com/-5DKcTHkf0g4/AAAAAAAAAAI/AAAAAAAAGXs/7u1ZXMdcrd4/photo.jpg",
//            "gender": "male",
//            "locale": "cs"
//    }
}

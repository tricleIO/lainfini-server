package application.rest.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by pfilip on 24.3.17.
 */
@Data
public class UserInstagramAccountDTO implements Serializable {

    @SerializedName("user")
    private InstagramData data;

    @Data
    public class InstagramData implements Serializable {

        private String id;

        private String username;

        private String full_name;

        private String profile_picture;

    }
}

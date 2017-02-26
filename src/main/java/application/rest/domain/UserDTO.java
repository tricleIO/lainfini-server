package application.rest.domain;

import application.persistence.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO implements ReadWriteDatabaseDTO<User> {

    private Integer uid;
    private String username;
    private String password;
    private Long customerId;

    @Override
    public User toEntity() {
        User user = new User();
        user.setId(uid);
        user.setLogin(username);
        user.setPassword(password);
        return user;
    }

}

package application.rest.domain;

import application.persistence.entity.User;
import lombok.Data;

@Data
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

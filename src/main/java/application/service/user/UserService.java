package application.service.user;

import application.persistence.entity.User;
import application.rest.domain.UserDTO;
import application.service.BaseDatabaseService;

import java.util.UUID;

public interface UserService extends BaseDatabaseService<User, UUID, UserDTO> {

//    ServiceResponse<UserDTO> read(String username);

}

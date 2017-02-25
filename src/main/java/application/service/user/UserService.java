package application.service.user;

import application.persistence.entity.User;
import application.rest.domain.UserDTO;
import application.service.DatabaseServiceInterface;

public interface UserService extends DatabaseServiceInterface<User, Long, UserDTO> {

}

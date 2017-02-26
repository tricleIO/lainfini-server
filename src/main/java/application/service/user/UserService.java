package application.service.user;

import application.persistence.entity.User;
import application.rest.domain.UserDTO;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;

public interface UserService extends DatabaseServiceInterface<User, Integer, UserDTO> {

    ServiceResponse<UserDTO> read(String username);

}

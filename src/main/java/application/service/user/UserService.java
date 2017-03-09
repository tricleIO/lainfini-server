package application.service.user;

import application.persistence.entity.User;
import application.rest.domain.UserDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;

public interface UserService extends BaseDatabaseService<User, Long, UserDTO> {

    ServiceResponse<UserDTO> read(String username);

}

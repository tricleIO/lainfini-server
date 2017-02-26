package application.service.user;

import application.persistence.entity.User;
import application.persistence.repository.UserRepository;
import application.rest.domain.UserDTO;
import application.service.AbstractDatabaseService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractDatabaseService<User, Integer, UserRepository, UserDTO> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserRepository getRepository() {
        return userRepository;
    }

    public ServiceResponse<UserDTO> read(String username) {
        User foundUser = userRepository.findByLogin(username);
        if (foundUser == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        return ServiceResponse.success(foundUser.toDTO());
    }

    @Override
    public ServiceResponse<UserDTO> create(UserDTO user) {
        if (exists(user)) {
            return ServiceResponse.error(ServiceResponseStatus.USERNAME_ALREADY_EXIST);
        }
        return super.create(user);
    }

    private boolean exists(UserDTO dto) {
        User foundUser = userRepository.findByLogin(dto.getUsername());
        return foundUser != null;
    }

}

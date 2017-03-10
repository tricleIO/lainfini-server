package application.service.user;

import application.persistence.entity.User;
import application.persistence.repository.UserRepository;
import application.rest.domain.UserDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseDatabaseServiceImpl<User, Long, UserRepository, UserDTO> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserRepository getRepository() {
        return userRepository;
    }

    public ServiceResponse<UserDTO> read(String username) {
        User foundUser = userRepository.findByLogin(username);
        if (foundUser == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        return ServiceResponse.success(foundUser.toDTO(false));
    }

    @Override
    public ServiceResponse<UserDTO> create(UserDTO user) {
        if (exists(user)) {
            return ServiceResponse.error(ServiceResponseStatus.USERNAME_ALREADY_EXISTS);
        }
        // bcrypt password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return super.create(user);
    }

    private boolean exists(UserDTO dto) {
        User foundUser = userRepository.findByLogin(dto.getUsername());
        return foundUser != null;
    }

}

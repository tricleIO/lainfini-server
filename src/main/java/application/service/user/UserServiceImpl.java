package application.service.user;

import application.persistence.entity.User;
import application.persistence.repository.UserRepository;
import application.rest.domain.UserDTO;
import application.service.AbstractDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractDatabaseService<User, Long, UserRepository, UserDTO> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserRepository getRepository() {
        return userRepository;
    }

}

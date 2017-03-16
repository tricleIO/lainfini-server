package application.service.security;

import application.persistence.entity.User;
import application.persistence.repository.UserRepository;
import application.persistence.type.UserStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByLoginAndRegisterStatus(username, UserStatusEnum.REGISTERED);
        if (user == null) {
            throw new UsernameNotFoundException(
                    String.format("User %s does not exist!", username)
            );
        }
        return new CustomUserDetails(user);
    }

   
}

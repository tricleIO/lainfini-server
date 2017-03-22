package application.service.user;

import application.persistence.entity.Role;
import application.persistence.entity.User;
import application.persistence.repository.RoleRepository;
import application.persistence.repository.UserRepository;
import application.persistence.type.UserRoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomerServiceImpl extends UserServiceImpl implements CustomerService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public UserRepository getRepository() {
        return userRepository;
    }

    @Override
    protected void doAfterConvertInCreate(User user) {
        Role role = roleRepository.findByValue(UserRoleEnum.ROLE_CUSTOMER);
        if (role != null) {
            Set<Role> roles = new HashSet<>(1);
            roles.add(role);
            user.setRoles(roles);
        }
        super.doAfterConvertInCreate(user);
    }

}

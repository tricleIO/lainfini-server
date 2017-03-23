package application.service.user;

import application.persistence.entity.Role;
import application.persistence.entity.User;
import application.persistence.repository.RoleRepository;
import application.persistence.repository.UserRepository;
import application.persistence.type.UserRoleEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.UserDTO;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public ServiceResponse<Page<UserDTO>> readAll(Pageable pageable) {
        Page<User> users = userRepository.findByRolesValue(UserRoleEnum.ROLE_CUSTOMER, pageable);
        return ServiceResponse.success(
                convertPageWithEntitiesToPageWithDtos(users, pageable)
        );
    }

    @Override
    public UserRepository getRepository() {
        return userRepository;
    }

    @Override
    protected void doAfterConvertInCreate(User user) {
        // if is created without password, set to unregistered
        if (user.getPassword() != null) {
            user.setRegisterStatus(UserStatusEnum.PRE_REGISTERED);
        } else {
            user.setRegisterStatus(UserStatusEnum.UNREGISTERED);
        }
        // set role to customer
        Role role = roleRepository.findByValue(UserRoleEnum.ROLE_CUSTOMER);
        if (role != null) {
            Set<Role> roles = new HashSet<>(1);
            roles.add(role);
            user.setRoles(roles);
        }
        super.doAfterConvertInCreate(user);
    }

}

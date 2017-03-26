package application.service.user;

import application.persistence.entity.Role;
import application.persistence.entity.User;
import application.persistence.repository.UserRepository;
import application.persistence.type.UserRoleEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.UserDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Service
@Primary
public class UserServiceImpl extends BaseDatabaseServiceImpl<User, UUID, UserRepository, UserDTO> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserRepository getRepository() {
        return userRepository;
    }

    public ServiceResponse<UserDTO> read(String username) {
        User foundUser = userRepository.findByEmail(username);
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
        if (user.getPassword() != null) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        return super.create(user);
    }

    private boolean exists(UserDTO dto) {
        User foundUser = userRepository.findByEmailAndRegisterStatus(dto.getUsername(), UserStatusEnum.REGISTERED);
        return foundUser != null;
    }

    @Override
    public ServiceResponse<UserDTO> readCurrentUser() {
        User user = CustomUserDetails.getCurrentUser();
        if (user == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        return ServiceResponse.success(user.toDTO(false));
    }

    @Override
    public ServiceResponse<Boolean> hasCurrentUserDemandedRoles(UserRoleEnum... demandedRoles) {
        User currentUser = CustomUserDetails.getCurrentUser();
        if (currentUser == null) {
            return ServiceResponse.error(ServiceResponseStatus.UNAUTHORIZED);
        }
        Set<Role> currentUserRoles = currentUser.getRoles();
        Set<UserRoleEnum> currentUserRoleValues = new LinkedHashSet<>(currentUserRoles.size());
        for (Role currentUserRole : currentUserRoles) {
            currentUserRoleValues.add(currentUserRole.getValue());
        }
        if (!currentUserRoleValues.containsAll(Arrays.asList(demandedRoles))) {
            return ServiceResponse.error(ServiceResponseStatus.READ_FORBIDDEN);
        }
        return ServiceResponse.success(true);
    }

    @Override
    public ServiceResponse<UserDTO> findByEmailVerificationTokenToken(String token) {
        User user = userRepository.findByEmailVerificationTokenToken(token);
        if (user == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        return ServiceResponse.success(user.toDTO(false));

    }

}

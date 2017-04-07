package application.service.user;

import application.persistence.entity.Role;
import application.persistence.entity.User;
import application.persistence.repository.UserRepository;
import application.persistence.type.LocaleEnum;
import application.persistence.type.UserRoleEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.MailDTO;
import application.rest.domain.UserDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.mail.MailService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;
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

    @Autowired
    private MailService mailService;

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
        // default locale
        if (user.getLocale() == null) {
            user.setLocale(LocaleEnum.NONE);
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

    public ServiceResponse<UserDTO> resetUserPassword(String email) {
        // read user
        ServiceResponse<UserDTO> readUserResponse = read(email);
        if (!readUserResponse.isSuccessful()) {
            // problem, not found etc.
            return ServiceResponse.error(readUserResponse.getStatus());
        }
        // get user to reset his password
        UserDTO userDTO = readUserResponse.getBody();
        // generate new password
        String newPassword = PasswordGenerator.generate();
        // patch user password
        ServiceResponse<UserDTO> patchPasswordResponse = patchUserPassword(
                userDTO.getUid(), newPassword
        );
        if (!patchPasswordResponse.isSuccessful()) {
            return ServiceResponse.error(patchPasswordResponse.getStatus());
        }
        // send reset password email to user
        ServiceResponse<MailDTO> mailResponse = mailService.sendMail(
                createResetPasswordEmailForUser(userDTO, newPassword)
        );
        if (!mailResponse.isSuccessful()) {
            return ServiceResponse.error(mailResponse.getStatus());
        }
        return patchPasswordResponse;
    }

    private ServiceResponse<UserDTO> patchUserPassword(UUID userId, String newPassword) {
        UserDTO user = new UserDTO();
        user.setUid(userId);
        user.setPassword(passwordEncoder.encode(newPassword));
        return patch(user);
    }

    private MailDTO createResetPasswordEmailForUser(UserDTO userDTO, String password) {
        MailDTO mailDTO = new MailDTO();
        mailDTO.setTo(userDTO.getEmail());
        mailDTO.setSubject("Reset password");
        mailDTO.setText("Dear Customer, your new password is: " + password);
        return mailDTO;
    }

    private static final class PasswordGenerator {
        private static SecureRandom random = new SecureRandom();

        public static String generate() {
            return new BigInteger(130, random).toString(32);
        }
    }

}

package application.service.user;

import application.configuration.AppProperties;
import application.persistence.entity.Role;
import application.persistence.entity.User;
import application.persistence.entity.UserEmailVerificationToken;
import application.persistence.repository.RoleRepository;
import application.persistence.repository.UserRepository;
import application.persistence.type.UserRoleEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.MailDTO;
import application.rest.domain.UserDTO;
import application.service.mail.MailService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.util.HtmlGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

@Service
public class CustomerServiceImpl extends UserServiceImpl implements CustomerService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private MailService mailService;

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private HtmlGenerator htmlGenerator;

    @Override
    public ServiceResponse<UserDTO> read(UUID key) {
        User customer = userRepository.findByIdAndRegisterStatusAndRolesValue(
                key, UserStatusEnum.REGISTERED, UserRoleEnum.ROLE_CUSTOMER
        );
        if (customer == null) {
            return ServiceResponse.error(ServiceResponseStatus.CUSTOMER_NOT_FOUND);
        }
        return ServiceResponse.success(customer.toDTO(false));
    }

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
            UserEmailVerificationToken userEmailVerificationToken = new UserEmailVerificationToken(user);
            user.setEmailVerificationToken(userEmailVerificationToken);
            MailDTO mailDTO = new MailDTO();
            mailDTO.setSubject("Registration");
            mailDTO.setTo(user.getEmail());

            final Context context = new Context(Locale.ENGLISH);
            context.setVariable("verificationLink", getVerificationUrl(userEmailVerificationToken));
            mailDTO.setText(htmlGenerator.generateHtml("templates/emails/user/registration_verification.html", context));
            mailService.sendMail(mailDTO);
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

    private String getVerificationUrl(UserEmailVerificationToken userEmailVerificationToken) {
       return appProperties.getFrontendAddress() + "email-verification/" + userEmailVerificationToken.getToken();
    }

}

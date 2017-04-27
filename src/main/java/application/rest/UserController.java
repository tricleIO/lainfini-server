package application.rest;

import application.persistence.entity.User;
import application.persistence.repository.UserRepository;
import application.persistence.type.UserRoleEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.MailDTO;
import application.rest.domain.UserDTO;
import application.service.mail.MailService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.service.security.CustomUserDetails;
import application.service.user.UserService;
import application.util.HtmlGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.context.Context;

import java.io.Serializable;
import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController extends AbstractDatabaseController<User, UUID, UserDTO, UserService> {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MailService mailService;

    @Autowired
    private AuthorizationServerTokenServices authorizationServerTokenServices;

    @Autowired
    private HtmlGenerator htmlGenerator;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readUsers(Pageable pageable) {
        // has logged user demanded roles
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // error
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        // then read
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readUser(@PathVariable UUID id) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(id);
        if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
        }
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody UserDTO user) {
        // has logged user demanded roles
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // error
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> patchUser(@PathVariable UUID id, @RequestBody UserDTO userDTO) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        ServiceResponse<Boolean> isCurrentUserResponse = userService.isCurrrentUser(id);
        if (!hasRolesResponse.isSuccessful() && !isCurrentUserResponse.isSuccessful()) {
            return new ErrorResponseEntity(ServiceResponseStatus.FORBIDDEN);
        }
        userDTO.setUid(id);
        return patch(userDTO);
    }

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public ResponseEntity<?> readCurrentUser() {
        return getSimpleResponseEntity(
                userService.readCurrentUser()
        );
    }

    @RequestMapping(value = "/password-reset", method = RequestMethod.POST)
    public ResponseEntity<?> resetPassword(@RequestBody UserDTO userDTO) {
        return getSimpleResponseEntity(
                userService.resetUserPassword(userDTO.getEmail())
        );
    }

    @RequestMapping(value = "/verify", method = RequestMethod.GET)
    public ResponseEntity<?> verifyUser(@RequestParam String verificationToken) {
//            Date expiryDate = body.toEntity(true).getEmailVerificationToken().getExpiryDate(); //todo: brát v potaz expiraci
        User user = userRepository.findByEmailVerificationTokenToken(verificationToken);
        if (user == null) {
            return new ErrorResponseEntity(ServiceResponseStatus.CUSTOMER_NOT_FOUND);
        }
        if (user.getRegisterStatus() == UserStatusEnum.PRE_REGISTERED) {
            user.setRegisterStatus(UserStatusEnum.REGISTERED);
            userRepository.save(user);
            // send mail in own thread
            new Thread(() -> sendConfirmationMail(user)).start();
        }

        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("USER"));

        Map<String, String> requestParameters = new HashMap<>();
        String clientId = "clientapp";
        boolean approved = true;
        Set<String> scope = new HashSet<>();
        scope.add("read");
        scope.add("write");
        Set<String> resourceIds = new HashSet<>();
        resourceIds.add("restservice");

        Map<String, Serializable> extensionProperties = new HashMap<>();
        OAuth2Request oAuth2Request = new OAuth2Request(requestParameters, clientId, authorities, approved, scope, resourceIds, null, null, extensionProperties);

        User userPrincipal = user;

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(new CustomUserDetails(userPrincipal), null, authorities);
        OAuth2Authentication auth = new OAuth2Authentication(oAuth2Request, authenticationToken);
        OAuth2AccessToken token2 = authorizationServerTokenServices.createAccessToken(auth);
        return new ResponseEntity<>(token2, HttpStatus.OK);
    }

    private void sendConfirmationMail(User user) {
        try {
            MailDTO mailDTO = new MailDTO();
            mailDTO.setTo(user.getEmail());
            mailDTO.setSubject("Registration confirmed");
            final Context context = new Context(Locale.ENGLISH);
            mailDTO.setText(htmlGenerator.generateHtml("templates/emails/user/registration_confirmation.html", context));
            mailService.sendMail(mailDTO);
        } catch (Exception ex) {
        }
    }

    @Override
    public UserService getBaseService() {
        return userService;
    }

}
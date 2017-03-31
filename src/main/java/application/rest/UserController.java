package application.rest;

import application.persistence.entity.FacebookAccount;
import application.persistence.entity.User;
import application.persistence.repository.FacebookAccountRepository;
import application.persistence.type.UserRoleEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.UserDTO;
import application.rest.domain.UserFacebookAccountDTO;
import application.rest.domain.UserInstagramAccountDTO;
import application.service.response.ServiceResponse;
import application.service.security.CustomUserDetails;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController extends AbstractDatabaseController<User, UUID, UserDTO, UserService> {

    @Autowired
    private UserService userService;

    @Autowired
    private FacebookAccountRepository facebookAccountRepository;

    @Autowired
    private AuthorizationServerTokenServices authorizationServerTokenServices;

    @Autowired
    private UserDetailsService userDetailsService;

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
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody UserDTO user) {
        return create(user);
    }

    @RequestMapping(value = "/facebook")
    public ResponseEntity<?> getFacebookUserDetails(@RequestParam String token) {
        String url = "https://graph.facebook.com/v2.8/me?fields=id,hometown,email,gender,first_name,last_name&access_token=" + token;
        RestTemplate restTemplate = new RestTemplate();
        UserFacebookAccountDTO forObject = restTemplate.getForObject(url, UserFacebookAccountDTO.class);
        return new ResponseEntity<Object>(forObject, HttpStatus.OK);
    }

    @RequestMapping(value = "/facebook/login", method = RequestMethod.GET)
    public ResponseEntity<OAuth2AccessToken> getFacebookUserId(@RequestParam String token) {
        String url = "https://graph.facebook.com/v2.8/me?fields=id&access_token=" + token;
        RestTemplate restTemplate = new RestTemplate();
        UserFacebookAccountDTO forObject = restTemplate.getForObject(url, UserFacebookAccountDTO.class);

        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
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

        FacebookAccount facebookAccount= facebookAccountRepository.findByFacebookId(forObject.getId());
        if (facebookAccount == null) {
            return null;
        }
        User userPrincipal = facebookAccount.getLinkedAccount().getCustomer();

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(new CustomUserDetails(userPrincipal), null, authorities);
        OAuth2Authentication auth = new OAuth2Authentication(oAuth2Request, authenticationToken);
        OAuth2AccessToken token2 = authorizationServerTokenServices.createAccessToken(auth);
        return new ResponseEntity<OAuth2AccessToken>(token2, HttpStatus.OK);
    }


    @RequestMapping(value = "/instagram")
    public ResponseEntity<?> getInstagramUserDetails(@RequestParam String token) {
        String url = "https://api.instagram.com/v1/users/self/?access_token=" + token;
        RestTemplate restTemplate = new RestTemplate();
        UserInstagramAccountDTO forObject = restTemplate.getForObject(url, UserInstagramAccountDTO.class);
        return new ResponseEntity<Object>(forObject, HttpStatus.OK);
    }

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public ResponseEntity<?> readCurrentUser() {
        return getSimpleResponseEntity(
                userService.readCurrentUser()
        );
    }

    @RequestMapping(value = "/password-reset", method = RequestMethod.POST)
    public ResponseEntity<?> resetPassword(@RequestParam(name = "email") String email) {
        return getSimpleResponseEntity(
                userService.resetUserPassword(email)
        );
    }

    @RequestMapping(value = "/verify", method = RequestMethod.GET)
    public ResponseEntity<?> verifyUser(@RequestParam String verificationToken) {
        UserDTO body = userService.findByEmailVerificationTokenToken(verificationToken).getBody();
        if (body != null) {
            if (body.getRegisterStatus().equals(UserStatusEnum.REGISTERED)) {
                return new ResponseEntity<>(
                        HttpStatus.OK
                );
            } else if (body.getRegisterStatus().equals(UserStatusEnum.PRE_REGISTERED)) {
//            Date expiryDate = body.toEntity(true).getEmailVerificationToken().getExpiryDate(); //todo: brát v potaz expiraci
                body.setRegisterStatus(UserStatusEnum.REGISTERED);
                userService.patch(body); //todo: tady dát lepší patch, aby nemazal heslo
                return new ResponseEntity<>(
                        HttpStatus.OK
                );
            }
        }

        return new ResponseEntity<>(
                "Token not found",
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @Override
    public UserService getBaseService() {
        return userService;
    }

}
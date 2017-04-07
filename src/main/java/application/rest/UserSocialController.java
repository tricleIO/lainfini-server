package application.rest;

import application.persistence.entity.FacebookAccount;
import application.persistence.entity.LinkedAccount;
import application.persistence.entity.User;
import application.persistence.repository.FacebookAccountRepository;
import application.persistence.repository.LinkedAccountRepository;
import application.persistence.type.AccountPartyEnum;
import application.persistence.type.StatusEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.LinkedAccountDTO;
import application.rest.domain.UserDTO;
import application.rest.domain.UserFacebookAccountDTO;
import application.service.security.CustomUserDetails;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.*;

/**
 * Created by pfilip on 3.4.17.
 */
@RestController
@RequestMapping(value = "/users/linkedAccounts")
public class UserSocialController extends AbstractDatabaseController<User, UUID, UserDTO, UserService> {

    @Autowired
    private UserService userService;

    @Autowired
    private LinkedAccountRepository linkedAccountRepository;

    @Autowired
    private FacebookAccountRepository facebookAccountRepository;

    @Autowired
    private AuthorizationServerTokenServices authorizationServerTokenServices;

    @Override
    public UserService getBaseService() {
        return userService;
    }

    /**
     * get all linked accounts
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getLinkedAccounts() {
        User currentUser = CustomUserDetails.getCurrentUser();
        if (currentUser != null) {
            return new ResponseEntity<Object>(linkedAccountRepository.findByCustomerId(currentUser.getId()), HttpStatus.OK);
        } else {
            return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
        }
    }


    /**
     * connect user account to service
     *
     * @param linkedAccountInput
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.PATCH)
    public ResponseEntity<?> connectAccount(@RequestBody LinkedAccountDTO linkedAccountInput) {
        User currentUser = CustomUserDetails.getCurrentUser();
        if (currentUser != null) {
            if (linkedAccountInput.getParty().equals(AccountPartyEnum.FACEBOOK)) {
                return new ResponseEntity<Object>(connectFacebookAccount(linkedAccountInput.getToken()), HttpStatus.OK);
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.INSTAGRAM)) {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.GOOGLE)) {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.TWITTER)) {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            } else {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
    }

    /**
     * Create new account from 3rd party service
     *
     * @param linkedAccountInput
     * @return
     */
    @RequestMapping(value = "/registration/1", method = RequestMethod.POST)
    public ResponseEntity<?> preRegisterUserByFacebookToken(@RequestBody LinkedAccountDTO linkedAccountInput) {
        User currentUser = CustomUserDetails.getCurrentUser();
        if (currentUser == null) {
            if (linkedAccountInput.getParty().equals(AccountPartyEnum.FACEBOOK)) {
                return new ResponseEntity<Object>(createNewAccountFromFacebook(linkedAccountInput.getToken()), HttpStatus.OK);
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.INSTAGRAM)) {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.GOOGLE)) {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.TWITTER)) {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            } else {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            }
        }
        return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
    }

    @RequestMapping(value = "/registration/2", method = RequestMethod.POST)
    public ResponseEntity<?> finishRegisterUserByFacebookToken(@RequestBody UserDTO userDTO) {
        LinkedAccountDTO linkedAccountInput = userDTO.getSocialRequest();
        User currentUser = CustomUserDetails.getCurrentUser();
        if (currentUser == null && linkedAccountInput != null) {
            if (linkedAccountInput.getParty().equals(AccountPartyEnum.FACEBOOK)) {
                LinkedAccount linkedAccountByFacebookToken = getLinkedAccountByFacebookToken(linkedAccountInput.getToken());
                if (linkedAccountByFacebookToken != null) {
                    linkedAccountByFacebookToken.setStatus(StatusEnum.ACTIVE);
                    User customer = linkedAccountByFacebookToken.getCustomer();
                    customer.setStatus(StatusEnum.ACTIVE);
                    customer.setRegisterStatus(UserStatusEnum.REGISTERED);
                    userService.patch(customer.toDTO(false));
                    return new ResponseEntity<Object>("", HttpStatus.OK);
                }
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.INSTAGRAM)) {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.GOOGLE)) {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.TWITTER)) {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            } else {
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
            }
        }
        return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.OK);
    }

    /**
     * Login via 3rd service token
     *
     * @param linkedAccountInput
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<OAuth2AccessToken> requestOauthByFacebookToken(@RequestBody LinkedAccountDTO linkedAccountInput) {

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

        LinkedAccount linkedAccount = null;

        if (linkedAccountInput.getParty().equals(AccountPartyEnum.FACEBOOK)) {
            linkedAccount = getLinkedAccountByFacebookToken(linkedAccountInput.getToken());
        } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.INSTAGRAM)) {
            return null;
        } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.GOOGLE)) {
            return null;
        } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.TWITTER)) {
            return null;
        } else {
            return null;
        }

        if (linkedAccount == null) {
            return null;
        }
        User userPrincipal = linkedAccount.getCustomer();

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(new CustomUserDetails(userPrincipal), null, authorities);
        OAuth2Authentication auth = new OAuth2Authentication(oAuth2Request, authenticationToken);
        OAuth2AccessToken token2 = authorizationServerTokenServices.createAccessToken(auth);
        return new ResponseEntity<OAuth2AccessToken>(token2, HttpStatus.OK);
    }

    /**
     * create new Account from facebook account
     *
     * @param token
     * @return
     */
    public boolean createNewAccountFromFacebook(String token) {
        String url = "https://graph.facebook.com/v2.8/me?fields=id,hometown,email,gender,first_name,last_name&access_token=" + token;
        RestTemplate restTemplate = new RestTemplate();
        UserFacebookAccountDTO userFacebookAccountDTO = restTemplate.getForObject(url, UserFacebookAccountDTO.class);

        FacebookAccount byFacebookId = facebookAccountRepository.findByFacebookId(userFacebookAccountDTO.getId());

        if (byFacebookId != null) {
            userFacebookAccountDTO.setStatusInSystem(byFacebookId.getLinkedAccount().getStatus());
            return false;
        }

        UserDTO userDTO = new UserDTO();
        userDTO.setRegisterStatus(UserStatusEnum.PRE_REGISTERED);
        userDTO.setUsername(userFacebookAccountDTO.getEmail());
        ResponseEntity<UserDTO> userEntity = (ResponseEntity<UserDTO>) create(userDTO);
        UserDTO body = userEntity.getBody();
        LinkedAccount linkedAccount = new LinkedAccount();
        linkedAccount.setParty(AccountPartyEnum.FACEBOOK);
        linkedAccount.setStatus(StatusEnum.INACTIVE);
        linkedAccount.setCustomer(body.toEntity(false));
        FacebookAccount facebookAccount = new FacebookAccount();
        facebookAccount.setLinkedAccount(linkedAccount);
        facebookAccount.setFacebookId(userFacebookAccountDTO.getId());
        facebookAccount.setUsername(userFacebookAccountDTO.getEmail());
        linkedAccount.setFacebookAccount(facebookAccount);
        LinkedAccount save = linkedAccountRepository.save(linkedAccount);
        return true;

    }

    /**
     * Connect facebook account to existing user
     *
     * @param token
     * @return
     */
    public boolean connectFacebookAccount(String token) {
        String url = "https://graph.facebook.com/v2.8/me?fields=id,hometown,email,gender,first_name,last_name&access_token=" + token;
        RestTemplate restTemplate = new RestTemplate();
        UserFacebookAccountDTO body1 = restTemplate.getForObject(url, UserFacebookAccountDTO.class);

        FacebookAccount byFacebookId = facebookAccountRepository.findByFacebookId(body1.getId());
        if (byFacebookId != null) {
            return false;
        }

        LinkedAccount linkedAccount = new LinkedAccount();
        linkedAccount.setParty(AccountPartyEnum.FACEBOOK);
        linkedAccount.setStatus(StatusEnum.ACTIVE);
        linkedAccount.setCustomer(CustomUserDetails.getCurrentUser());
        FacebookAccount facebookAccount = new FacebookAccount();
        facebookAccount.setLinkedAccount(linkedAccount);
        facebookAccount.setFacebookId(body1.getId());
        facebookAccount.setUsername(body1.getEmail());
        linkedAccount.setFacebookAccount(facebookAccount);
        LinkedAccount save = linkedAccountRepository.save(linkedAccount);
        return true;
    }

    /**
     * get linked account from facebook token
     * @param token
     * @return
     */
    private LinkedAccount getLinkedAccountByFacebookToken(String token) {
        String url = "https://graph.facebook.com/v2.8/me?fields=id&access_token=" + token;
        RestTemplate restTemplate = new RestTemplate();
        UserFacebookAccountDTO forObject = restTemplate.getForObject(url, UserFacebookAccountDTO.class);
        FacebookAccount facebookAccount = facebookAccountRepository.findByFacebookId(forObject.getId());
        if (facebookAccount != null) {
            return facebookAccount.getLinkedAccount();
        } else {
            return null;
        }
    }


//    @RequestMapping(value = "/instagram")
//    public ResponseEntity<?> getInstagramUserDetails(@RequestParam String token) {
//        String url = "https://api.instagram.com/v1/users/self/?access_token=" + token;
//        RestTemplate restTemplate = new RestTemplate();
//        UserInstagramAccountDTO forObject = restTemplate.getForObject(url, UserInstagramAccountDTO.class);
//        return new ResponseEntity<Object>(forObject, HttpStatus.OK);
//    }
}

package application.rest;

import application.persistence.entity.FacebookAccount;
import application.persistence.entity.InstagramAccount;
import application.persistence.entity.LinkedAccount;
import application.persistence.entity.User;
import application.persistence.repository.FacebookAccountRepository;
import application.persistence.repository.InstagramAccountRepository;
import application.persistence.repository.LinkedAccountRepository;
import application.persistence.type.AccountPartyEnum;
import application.persistence.type.StatusEnum;
import application.persistence.type.UserStatusEnum;
import application.rest.domain.LinkedAccountDTO;
import application.rest.domain.UserDTO;
import application.rest.domain.UserFacebookAccountDTO;
import application.rest.domain.UserInstagramAccountDTO;
import application.service.Connection;
import application.service.security.CustomUserDetails;
import application.service.user.UserService;
import com.google.api.client.googleapis.auth.oauth2.*;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
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
    private InstagramAccountRepository instagramAccountRepository;

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
                return new ResponseEntity<Object>(connectInstagramAccount(linkedAccountInput.getToken()), HttpStatus.OK);
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
    public ResponseEntity<?> preRegistrationUserByToken(@RequestBody LinkedAccountDTO linkedAccountInput) {
        User currentUser = CustomUserDetails.getCurrentUser();
        if (currentUser == null) {
            if (linkedAccountInput.getParty().equals(AccountPartyEnum.FACEBOOK)) {
                return createNewAccountFromFacebook(linkedAccountInput.getToken());
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.INSTAGRAM)) {
                return createNewAccountFromInstagram(linkedAccountInput.getToken());
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
    public ResponseEntity<?> finishRegistritaionUserByToken(@RequestBody UserDTO userDTO) {
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
                    return new ResponseEntity<Object>(HttpStatus.OK);
                }
            } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.INSTAGRAM)) {
                LinkedAccount linkedAccountByInstagramCode = getLinkedAccountByInstagramCode(linkedAccountInput.getToken());
                if (linkedAccountByInstagramCode != null) {
                    linkedAccountByInstagramCode.setStatus(StatusEnum.ACTIVE);
                    User customer = linkedAccountByInstagramCode.getCustomer();
                    customer.setStatus(StatusEnum.ACTIVE);
                    customer.setRegisterStatus(UserStatusEnum.REGISTERED);
                    userService.patch(customer.toDTO(false));
                    return new ResponseEntity<Object>( HttpStatus.OK);
                }
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
            linkedAccount = getLinkedAccountByInstagramCode(linkedAccountInput.getToken());
        } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.GOOGLE)) {
            linkedAccount = getLinkedAccountByGoogleToken(linkedAccountInput.getToken());
        } else if (linkedAccountInput.getParty().equals(AccountPartyEnum.TWITTER)) {
            return null;
        } else {
            return null;
        }

        if (linkedAccount == null || linkedAccount.getStatus().equals(StatusEnum.INACTIVE)) {
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
    private ResponseEntity<UserDTO> createNewAccountFromFacebook(String token) {
        UserFacebookAccountDTO userFacebookAccountDTO = getUserFacebookAccountDTO(token);

        FacebookAccount byFacebookId = facebookAccountRepository.findByFacebookId(userFacebookAccountDTO.getId());

        if (byFacebookId != null) {
            //userFacebookAccountDTO.setStatusInSystem(byFacebookId.getLinkedAccount().getStatus());
            throw new RuntimeException("User already exists!");
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
        return userEntity;

    }

    private ResponseEntity<UserDTO> createNewAccountFromInstagram(String token) {
        UserInstagramAccountDTO userInstagramAccountDTO = getInstagramUserByCode(token);

        InstagramAccount byFacebookId = instagramAccountRepository.findByInstagramId(userInstagramAccountDTO.getData().getId());

        if (byFacebookId != null) {
            //userInstagramAccountDTO.setStatusInSystem(byFacebookId.getLinkedAccount().getStatus());
            throw new RuntimeException("User already exists!");
        }

        UserDTO userDTO = new UserDTO();
        userDTO.setRegisterStatus(UserStatusEnum.PRE_REGISTERED);
        userDTO.setUsername(userInstagramAccountDTO.getData().getUsername());
        ResponseEntity<UserDTO> userEntity = (ResponseEntity<UserDTO>) create(userDTO);
        UserDTO body = userEntity.getBody();
        LinkedAccount linkedAccount = new LinkedAccount();
        linkedAccount.setParty(AccountPartyEnum.FACEBOOK);
        linkedAccount.setStatus(StatusEnum.INACTIVE);
        linkedAccount.setCustomer(body.toEntity(false));
        InstagramAccount facebookAccount = new InstagramAccount();
        facebookAccount.setLinkedAccount(linkedAccount);
        facebookAccount.setInstagramId(userInstagramAccountDTO.getData().getId());
        facebookAccount.setUsername(userInstagramAccountDTO.getData().getUsername());
        linkedAccount.setInstagramAccount(facebookAccount);
        LinkedAccount save = linkedAccountRepository.save(linkedAccount);
        return userEntity;

    }

    /**
     * Connect facebook account to existing user
     *
     * @param token
     * @return
     */
    private boolean connectFacebookAccount(String token) {
        UserFacebookAccountDTO userFacebookAccountDTO = getUserFacebookAccountDTO(token);


        FacebookAccount byFacebookId = facebookAccountRepository.findByFacebookId(userFacebookAccountDTO.getId());
        if (byFacebookId != null) {
            return false;
        }

        LinkedAccount linkedAccount = new LinkedAccount();
        linkedAccount.setParty(AccountPartyEnum.FACEBOOK);
        linkedAccount.setStatus(StatusEnum.ACTIVE);
        linkedAccount.setCustomer(CustomUserDetails.getCurrentUser());
        FacebookAccount facebookAccount = new FacebookAccount();
        facebookAccount.setLinkedAccount(linkedAccount);
        facebookAccount.setFacebookId(userFacebookAccountDTO.getId());
        facebookAccount.setUsername(userFacebookAccountDTO.getEmail());
        linkedAccount.setFacebookAccount(facebookAccount);
        LinkedAccount save = linkedAccountRepository.save(linkedAccount);
        return true;
    }

    private boolean connectInstagramAccount(String token) {
        UserInstagramAccountDTO forObject = getInstagramUserByCode(token);

        if (forObject == null) {
            return false;
        }

        InstagramAccount byInstagramId = instagramAccountRepository.findByInstagramId(forObject.getData().getId());
        if (byInstagramId != null) {
            return false;
        }

        LinkedAccount linkedAccount = new LinkedAccount();
        linkedAccount.setParty(AccountPartyEnum.INSTAGRAM);
        linkedAccount.setStatus(StatusEnum.ACTIVE);
        linkedAccount.setCustomer(CustomUserDetails.getCurrentUser());
        InstagramAccount instagramAccount = new InstagramAccount();
        instagramAccount.setLinkedAccount(linkedAccount);
        instagramAccount.setInstagramId(forObject.getData().getId());
        instagramAccount.setUsername(forObject.getData().getUsername());
        linkedAccount.setInstagramAccount(instagramAccount);
        LinkedAccount save = linkedAccountRepository.save(linkedAccount);
        return true;
    }

    /**
     * get linked account from facebook token
     *
     * @param token
     * @return
     */
    private LinkedAccount getLinkedAccountByFacebookToken(String token) {
        UserFacebookAccountDTO userFacebookAccountDTO = getUserFacebookAccountDTO(token);
        FacebookAccount facebookAccount = facebookAccountRepository.findByFacebookId(userFacebookAccountDTO.getId());
        if (facebookAccount != null) {
            return facebookAccount.getLinkedAccount();
        } else {
            return null;
        }
    }

    private LinkedAccount getLinkedAccountByInstagramCode(String token) {
        UserInstagramAccountDTO instagramByCode = getInstagramUserByCode(token);
        InstagramAccount instagramAccount = instagramAccountRepository.findByInstagramId(instagramByCode.getData().getId());
        if (instagramAccount != null) {
            return instagramAccount.getLinkedAccount();
        } else {
            return null;
        }
    }

    private LinkedAccount getLinkedAccountByGoogleToken(String token) {

        String s = "{\"web\":" +
                "{\"client_id\":\"871228726029-kgmm585lvh22knlgkn5laapblpt1e0p8.apps.googleusercontent.com\"," +
                "\"project_id\":\"lainfini-local\"," +
                "\"auth_uri\":\"https://accounts.google.com/o/oauth2/auth\"," +
                "\"token_uri\":\"https://accounts.google.com/o/oauth2/token\"," +
                "\"auth_provider_x509_cert_url\":\"https://www.googleapis.com/oauth2/v1/certs\"," +
                "\"client_secret\":\"E82fI2YWbLypyvDVdaauulG_\"," +
                "\"javascript_origins\":[\"http://localhost:8080\"]}}";
        String CLIENT_SECRET_FILE = "/path/to/client_secret.json";

// Exchange auth code for access token
        GoogleClientSecrets clientSecrets = null;
        try {
            clientSecrets = GoogleClientSecrets.load(JacksonFactory.getDefaultInstance(), new StringReader(s));
        } catch (IOException e) {
            e.printStackTrace();
        }


        HttpTransport httpTransport = new NetHttpTransport();
        JsonFactory jsonFactory = new JacksonFactory();

        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(httpTransport, jsonFactory,
                clientSecrets.getDetails().getClientId(),
                clientSecrets.getDetails().getClientSecret(), Arrays.asList("https://www.googleapis.com/auth/plus.login ", "https://www.googleapis.com/auth/plus.me")).build();
        String url = flow.newAuthorizationUrl().setRedirectUri("http://localhost:8080").build();
        System.out.println(url);

        GoogleTokenResponse tokenResponse = null;
        try {
            tokenResponse = new GoogleAuthorizationCodeTokenRequest(
                    new NetHttpTransport(),
                    JacksonFactory.getDefaultInstance(),
                    "https://www.googleapis.com/oauth2/v4/token",
                    clientSecrets.getDetails().getClientId(),
                    clientSecrets.getDetails().getClientSecret(),
                    token,
                    "")  // Specify the same redirect URI that you use with your web
                    // app. If you don't have a web version of your app, you can
                    // specify an empty string.
                    .execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String accessToken = tokenResponse.getAccessToken();

// Use access token to call API
        GoogleCredential credential = new GoogleCredential().setAccessToken(accessToken);


// Get profile info from ID token
        GoogleIdToken idToken = null;
        try {
            idToken = tokenResponse.parseIdToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        GoogleIdToken.Payload payload = idToken.getPayload();
        String userId = payload.getSubject();  // Use this value as a key to identify a user.
        String email = payload.getEmail();
        boolean emailVerified = Boolean.valueOf(payload.getEmailVerified());
        String name = (String) payload.get("name");
        String pictureUrl = (String) payload.get("picture");
        String locale = (String) payload.get("locale");
        String familyName = (String) payload.get("family_name");
        String givenName = (String) payload.get("given_name");
        return null;
    }

    ///helpers

    private UserInstagramAccountDTO getInstagramUserByCode(String code) {
        //String url1 = "https://api.instagram.com/oauth/authorize/?client_id=b9ef38ab779242b8b06b2047f6bf8781&redirect_uri=http://localhost:8080/users/linkedAccounts&response_type=code";

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        parts.add("client_id", "b9ef38ab779242b8b06b2047f6bf8781");
        parts.add("client_secret", "42229c16359e4508a67000502c04d2d8");
        parts.add("grant_type", "authorization_code");
        parts.add("redirect_uri", "http://localhost:8080");
        parts.add("code", code);

        HttpEntity httpEntity = new HttpEntity(parts, requestHeaders);

        String url = "https://api.instagram.com/oauth/access_token";
        Connection connection = new Connection();
        ResponseEntity<String> stringResponseEntity = connection.doRequest(url, HttpMethod.POST, httpEntity, String.class);

        UserInstagramAccountDTO userInstagramAccountDTO = new Gson().fromJson(stringResponseEntity.getBody(), UserInstagramAccountDTO.class);
        return userInstagramAccountDTO;
    }

    private UserFacebookAccountDTO getUserFacebookAccountDTO(String token) {
        String url = "https://graph.facebook.com/v2.8/me?fields=id,hometown,email,gender,first_name,last_name&access_token=" + token;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, UserFacebookAccountDTO.class);
    }
}

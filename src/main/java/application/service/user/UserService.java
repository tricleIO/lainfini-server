package application.service.user;

import application.persistence.entity.User;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.UserDTO;
import application.service.BaseSoftDeletableDatabaseService;
import application.service.response.ServiceResponse;

import java.util.UUID;

public interface UserService extends BaseSoftDeletableDatabaseService<User, UUID, UserDTO> {

    ServiceResponse<UserDTO> readCurrentUser();
    ServiceResponse<Boolean> hasCurrentUserDemandedRoles(UserRoleEnum... demandedRoles);
    ServiceResponse<Boolean> isCurrrentUser(UUID userId);
    ServiceResponse<UserDTO> findByEmailVerificationTokenToken(String token);
    ServiceResponse<UserDTO> resetUserPassword(String userId);

}

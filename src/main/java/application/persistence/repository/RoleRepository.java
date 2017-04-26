package application.persistence.repository;

import application.persistence.entity.Role;
import application.persistence.type.UserRoleEnum;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

    Role findByValue(UserRoleEnum userRoleEnumItem);

}
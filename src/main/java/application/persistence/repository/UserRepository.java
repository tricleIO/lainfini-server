/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package application.persistence.repository;

import application.persistence.entity.User;
import application.persistence.type.UserRoleEnum;
import application.persistence.type.UserStatusEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface UserRepository extends PagingAndSortingRepository<User, UUID> {

	User findByEmail(String login);
	User findByEmailAndRegisterStatus(String login, UserStatusEnum registerStatus);
	User findByEmailVerificationTokenToken(String token);
	Page<User> findByRolesValue(UserRoleEnum userRole, Pageable pageable);
	User findByIdAndRegisterStatusAndRolesValue(UUID id, UserStatusEnum registerStatus, UserRoleEnum userRole);

}

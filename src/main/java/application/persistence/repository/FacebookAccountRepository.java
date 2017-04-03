package application.persistence.repository;

import application.persistence.entity.FacebookAccount;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by pfilip on 31.3.17.
 */
public interface FacebookAccountRepository extends PagingAndSortingRepository<FacebookAccount, Long> {
    FacebookAccount findByFacebookId(String facebookId);
}

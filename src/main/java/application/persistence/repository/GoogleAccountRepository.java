package application.persistence.repository;

import application.persistence.entity.GoogleAccount;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by pfilip on 14.4.17.
 */
public interface GoogleAccountRepository extends PagingAndSortingRepository<GoogleAccount, Long> {

    GoogleAccount findByGoogleId(String instagramId);

}

package application.persistence.repository;

import application.persistence.entity.InstagramAccount;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by pfilip on 31.3.17.
 */
public interface InstagramAccountRepository extends PagingAndSortingRepository<InstagramAccount, Long> {
    InstagramAccount findByInstagramId(String instagramId);
}

package application.persistence.repository;

import application.persistence.entity.LinkedAccount;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by pfilip on 3.4.17.
 */
public interface LinkedAccountRepository extends PagingAndSortingRepository<LinkedAccount, Long> {

    List<LinkedAccount> findByCustomerId(UUID customerUUID);
}

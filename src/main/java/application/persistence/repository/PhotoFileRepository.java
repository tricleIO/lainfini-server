package application.persistence.repository;

import application.persistence.entity.PhotoFile;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by pfilip on 2.3.17.
 */
public interface PhotoFileRepository extends PagingAndSortingRepository<PhotoFile, Long> {
}

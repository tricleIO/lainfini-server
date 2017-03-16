package application.persistence.repository;

import application.persistence.entity.FileCollection;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by pfilip on 13.3.17.
 */
public interface FileCollectionRepository extends PagingAndSortingRepository<FileCollection, Long> {
}

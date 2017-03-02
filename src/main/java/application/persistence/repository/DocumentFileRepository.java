package application.persistence.repository;

import application.persistence.entity.DocumentFile;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
public interface DocumentFileRepository extends PagingAndSortingRepository<DocumentFile, Long> {
    DocumentFile findByIndex(UUID fileIndex);
}

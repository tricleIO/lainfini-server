package application.persistence.repository;

import application.persistence.entity.AbstractFile;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
@NoRepositoryBean
public interface AbstractFileRepository<E extends AbstractFile> extends PagingAndSortingRepository<E, Long> {
    E findByIndex(UUID fileIndex);
}

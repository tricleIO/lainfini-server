package application.persistence.repository;

import application.persistence.entity.ImageFile;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by pfilip on 2.3.17.
 */
public interface ImageFileRepository extends PagingAndSortingRepository<ImageFile, Long> {

}

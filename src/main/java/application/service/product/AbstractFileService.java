package application.service.product;

import application.persistence.entity.AbstractFile;
import application.rest.domain.EntityConvertable;
import application.service.DatabaseServiceInterface;
import org.springframework.http.ResponseEntity;

import java.util.UUID;


/**
 * Created by pfilip on 2.3.17.
 */
public interface AbstractFileService<E extends AbstractFile<D>, D extends EntityConvertable<E>> extends DatabaseServiceInterface<E, Long, D> {

    ResponseEntity<?> findByIndex(UUID fileIndex);

    String getStoreLocation();
}

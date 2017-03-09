package application.service.product;

import application.persistence.entity.AbstractFile;
import application.rest.domain.AbstractFileDTO;
import application.service.DatabaseServiceInterface;
import application.service.response.ServiceResponse;

import java.util.UUID;


/**
 * Created by pfilip on 2.3.17.
 */
public interface AbstractFileService<E extends AbstractFile<D>, D extends AbstractFileDTO<E>> extends DatabaseServiceInterface<E, Long, D> {

    ServiceResponse<?> findByIndex(UUID fileIndex);

    String getStoreLocation();
}

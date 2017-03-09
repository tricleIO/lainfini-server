package application.service.product;

import application.persistence.entity.ApplicationFile;
import application.rest.domain.ApplicationFileDTO;
import application.service.DatabaseServiceInterface;

/**
 * Created by pfilip on 2.3.17.
 */
public interface ApplicationFileService extends DatabaseServiceInterface<ApplicationFile, Long, ApplicationFileDTO>,AbstractFileService<ApplicationFile,ApplicationFileDTO> {
}

package application.service.product;

import application.persistence.entity.ApplicationFile;
import application.rest.domain.ApplicationFileDTO;
import application.service.BaseDatabaseService;

/**
 * Created by pfilip on 2.3.17.
 */
public interface ApplicationFileService extends BaseDatabaseService<ApplicationFile, Long, ApplicationFileDTO>,AbstractFileService<ApplicationFile,ApplicationFileDTO> {


}

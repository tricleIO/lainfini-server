package application.service.product;

import application.persistence.entity.AbstractFile;
import application.persistence.entity.ImageFile;
import application.rest.domain.AbstractFileDTO;
import application.rest.domain.ImageFileDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;

/**
 * Created by pfilip on 2.3.17.
 */
public interface ImageFileService<E extends AbstractFile,D extends AbstractFileDTO> extends BaseDatabaseService<ImageFile, Long, ImageFileDTO> {

    boolean createResizedCopyAndSave(String pathToOrigin, String extension, int width, int height);

    boolean createCopyAndSave(String pathToOrigin, String extension);

    ServiceResponse<D> create(D abstractFileDTO);
}

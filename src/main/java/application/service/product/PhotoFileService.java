package application.service.product;

import application.persistence.entity.PhotoFile;
import application.rest.domain.PhotoFileDTO;

/**
 * Created by pfilip on 2.3.17.
 */
public interface PhotoFileService extends AbstractFileService<PhotoFile, PhotoFileDTO> {

    boolean createResizedCopyAndSave(String pathToOrigin, String extension, int width, int height);

    boolean createCopyAndSave(String pathToOrigin, String extension);

}

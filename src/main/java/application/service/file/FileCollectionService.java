package application.service.file;

import application.persistence.entity.FileCollection;
import application.rest.domain.FileCollectionDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;

import java.util.UUID;

/**
 * Created by pfilip on 13.3.17.
 */
public interface FileCollectionService extends BaseDatabaseService<FileCollection, Long, FileCollectionDTO> {
    ServiceResponse<FileCollectionDTO> addFileToCollection(Long collectionId, UUID fileId);

    ServiceResponse<FileCollectionDTO> removeFileFromCollection(Long collectionId, UUID fileId);
}

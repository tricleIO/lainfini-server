package application.service.file;

import application.persistence.entity.FileCollection;
import application.persistence.repository.FileCollectionRepository;
import application.rest.domain.FileCollectionDTO;
import application.service.BaseDatabaseService;
import application.service.SlugService;
import application.service.response.ServiceResponse;

import java.util.UUID;

/**
 * Created by pfilip on 13.3.17.
 */
public interface FileCollectionService extends BaseDatabaseService<FileCollection, Long, FileCollectionDTO>, SlugService<FileCollection, FileCollectionRepository, FileCollectionDTO> {
    ServiceResponse<FileCollectionDTO> addFileToCollection(Long collectionId, UUID fileId);

    ServiceResponse<FileCollectionDTO> removeFileFromCollection(Long collectionId, UUID fileId);
}

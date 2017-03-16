package application.service.file;

import application.persistence.entity.ApplicationFile;
import application.persistence.entity.FileCollection;
import application.persistence.entity.FileCollectionHasFile;
import application.persistence.repository.FileCollectionRepository;
import application.rest.domain.FileCollectionDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.product.ApplicationFileService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by pfilip on 13.3.17.
 */
@Service
public class FileCollectionServiceImpl extends BaseDatabaseServiceImpl<FileCollection, Long, FileCollectionRepository, FileCollectionDTO> implements FileCollectionService {

    @Autowired
    private FileCollectionRepository fileCollectionRepository;

    @Autowired
    private ApplicationFileService applicationFileService;

    @Override
    public FileCollectionRepository getRepository() {
        return fileCollectionRepository;
    }

    @Override
    public ServiceResponse<FileCollectionDTO> addFileToCollection(Long collectionId, UUID fileId) {
        FileCollection collection = fileCollectionRepository.findOne(collectionId);
        ApplicationFile applicationFile = applicationFileService.findEntityByIndex(fileId);


        if (collection == null || applicationFile == null) {
            return ServiceResponse.error(ServiceResponseStatus.INTERNAL_ERROR);
        }
            FileCollectionHasFile fileCollectionHasFile = new FileCollectionHasFile();
            fileCollectionHasFile.getFc().setCollection(collection);
            fileCollectionHasFile.getFc().setFile(applicationFile);

        collection.getFiles().add(fileCollectionHasFile);
        FileCollection save = fileCollectionRepository.save(collection);
        return ServiceResponse.success(collection.toDTO(true));
    }

    @Override
    public ServiceResponse<FileCollectionDTO> removeFileFromCollection(Long collectionId, UUID fileId) {
        FileCollection collection = fileCollectionRepository.findOne(collectionId);
        ApplicationFile applicationFile = applicationFileService.findEntityByIndex(fileId);


        if (collection == null || applicationFile == null) {
            return ServiceResponse.error(ServiceResponseStatus.INTERNAL_ERROR);
        }
        FileCollectionHasFile fileCollectionHasFile = new FileCollectionHasFile();
        fileCollectionHasFile.getFc().setCollection(collection);
        fileCollectionHasFile.getFc().setFile(applicationFile);

        collection.getFiles().remove(fileCollectionHasFile);
        FileCollection save = fileCollectionRepository.save(collection);
        return ServiceResponse.success(save.toDTO(true));
    }
}

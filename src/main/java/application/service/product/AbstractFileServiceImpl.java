package application.service.product;


import application.persistence.DTOConvertable;
import application.persistence.entity.AbstractFile;
import application.persistence.repository.AbstractFileRepository;
import application.persistence.type.FileStatusEnum;
import application.rest.domain.AbstractFileDTO;
import application.service.AbstractDatabaseService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.util.FileUtil;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
public abstract class AbstractFileServiceImpl<E extends AbstractFile<S> & DTOConvertable<S>,D extends PagingAndSortingRepository<E, Long>,S extends AbstractFileDTO<E>> extends AbstractDatabaseService<E, Long, D, S> {


    public ResponseEntity<?> findByIndex(UUID fileIndex) {
        AbstractFile byIndex = ((AbstractFileRepository)getRepository()).findByIndex(fileIndex);
        return ResponseEntity.ok(byIndex);
    }

    @Override
    public ServiceResponse<S> create(S dto) {
        String storeLocation = getStoreLocation();

        dto.setFileStatus(FileStatusEnum.UPLOADING);
        E workingDocumentFile = getRepository().save(dto.toEntity());

        workingDocumentFile.setIndex(UUID.randomUUID());

        MultipartFile file = dto.getFile();
        if (!file.isEmpty()) {
            try {
                String structuredDirectoryFromId = storeLocation + FileUtil.getStructuredDirectoryFromId(workingDocumentFile.getId());
                if (!FileUtil.checkOrCreatePathToDirectory(structuredDirectoryFromId)) {
                    return ServiceResponse.error(ServiceResponseStatus.INTERNAL_ERROR); //todo změnit response
                }
                String filePath = structuredDirectoryFromId +"/"+ file.getOriginalFilename();
                File dest = new File(filePath);
                file.transferTo(dest);
                workingDocumentFile.setFileStatus(FileStatusEnum.UPLOADED);

                beforeRecordSaved(dest, workingDocumentFile);

                workingDocumentFile = getRepository().save(workingDocumentFile);
                return ServiceResponse.success(workingDocumentFile.toDTO());
            } catch (IOException e) {
                e.printStackTrace();
                workingDocumentFile.setFileStatus(FileStatusEnum.NOT_UPLOADED);
                getRepository().save(workingDocumentFile);
            }
        }

        return ServiceResponse.error(ServiceResponseStatus.INTERNAL_ERROR);  //todo změnit response
    }

    protected void beforeRecordSaved(File file, E workingDocumentFile) {

    }

    protected abstract String getStoreLocation();
}

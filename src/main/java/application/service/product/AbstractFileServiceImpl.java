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
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
public abstract class AbstractFileServiceImpl<E extends AbstractFile<S> & DTOConvertable<S>,D extends PagingAndSortingRepository<E, Long>,S extends AbstractFileDTO<E>> extends AbstractDatabaseService<E, Long, D, S> {


    public ServiceResponse<S> findByIndex(UUID fileIndex) {
        AbstractFile byIndex = ((AbstractFileRepository) getRepository()).findByIndex(fileIndex);
        if (byIndex != null) {
            S byIndexDto = (S) byIndex.toDTO();
            return ServiceResponse.success(byIndexDto);
        } else {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
    }

    @Override
    public ServiceResponse<S> create(S dto) {
        String storeLocation = getStoreLocation();

        dto.setFileStatus(FileStatusEnum.UPLOADING);
        E workingDocumentFile = getRepository().save(dto.toEntity());

        workingDocumentFile.setIndex(UUID.randomUUID());

        MultipartFile file = dto.getFile();
        if (file != null && !file.isEmpty()) {
            try {
                String structuredDirectoryFromId = storeLocation + FileUtil.getStructuredDirectoryFromId(workingDocumentFile.getId());
                if (!FileUtil.checkOrCreatePathToDirectory(structuredDirectoryFromId)) {
                    return ServiceResponse.error(ServiceResponseStatus.INTERNAL_ERROR); //todo změnit response
                }
                String filePath = structuredDirectoryFromId +"/"+ workingDocumentFile.getId();
                File dest = new File(filePath);
                file.transferTo(dest);


                Path path = Paths.get(filePath);
                String mimeType = Files.probeContentType(path);
                workingDocumentFile.setMimeType(mimeType);
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

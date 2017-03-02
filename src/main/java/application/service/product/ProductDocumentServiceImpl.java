package application.service.product;

import application.configuration.AppProperties;
import application.persistence.entity.DocumentFile;
import application.persistence.repository.DocumentFileRepository;
import application.persistence.type.FileStatusEnum;
import application.rest.domain.DocumentFileDTO;
import application.service.AbstractDatabaseService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
@Service
public class ProductDocumentServiceImpl extends AbstractDatabaseService<DocumentFile, Long, DocumentFileRepository, DocumentFileDTO> implements ProductDocumentService {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private DocumentFileRepository documentFileRepository;

    @Override
    public DocumentFileRepository getRepository() {
        return documentFileRepository;
    }

    @Override
    public ServiceResponse<DocumentFileDTO> create(DocumentFileDTO dto) {
        String storeLocation = appProperties.getProductDocumentStoreLocation();

        dto.setFileStatus(FileStatusEnum.UPLOADING);
        DocumentFile workingDocumentFile = getRepository().save(dto.toEntity());

        workingDocumentFile.setIndex(UUID.randomUUID());

        MultipartFile file = dto.getFile();
        if (!file.isEmpty()) {
            try {
                String uploadsDir = storeLocation;


                String structuredDirectoryFromId = uploadsDir +FileUtil.getStructuredDirectoryFromId(workingDocumentFile.getId());
                if (!FileUtil.checkOrCreatePathToDirectory(structuredDirectoryFromId)) {
                    return ServiceResponse.error(ServiceResponseStatus.INTERNAL_ERROR); //todo změnit response
                }
                String filePath = structuredDirectoryFromId +"/"+ file.getOriginalFilename();
                File dest = new File(filePath);
                file.transferTo(dest);
                workingDocumentFile.setFileStatus(FileStatusEnum.UPLOADED);

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

    @Override
    public ResponseEntity<?> findByIndex(UUID fileIndex) {
        DocumentFile byIndex = documentFileRepository.findByIndex(fileIndex);
        return ResponseEntity.ok(byIndex);
    }
}

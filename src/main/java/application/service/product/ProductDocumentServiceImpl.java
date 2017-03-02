package application.service.product;

import application.configuration.AppProperties;
import application.persistence.entity.ProductDocument;
import application.persistence.repository.ProductDocumentRepository;
import application.persistence.type.FileStatusEnum;
import application.rest.domain.ProductDocumentDTO;
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
public class ProductDocumentServiceImpl extends AbstractDatabaseService<ProductDocument, Long, ProductDocumentRepository, ProductDocumentDTO> implements ProductDocumentService {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private ProductDocumentRepository productDocumentRepository;

    @Override
    public ProductDocumentRepository getRepository() {
        return productDocumentRepository;
    }

    @Override
    public ServiceResponse<ProductDocumentDTO> create(ProductDocumentDTO dto) {
        String storeLocation = appProperties.getProductDocumentStoreLocation();

        dto.setFileStatus(FileStatusEnum.UPLOADING);
        ProductDocument workingProductDocument = getRepository().save(dto.toEntity());

        workingProductDocument.setIndex(UUID.randomUUID());

        MultipartFile file = dto.getFile();
        if (!file.isEmpty()) {
            try {
                String uploadsDir = storeLocation;


                String structuredDirectoryFromId = uploadsDir +FileUtil.getStructuredDirectoryFromId(workingProductDocument.getId());
                if (!FileUtil.checkOrCreatePathToDirectory(structuredDirectoryFromId)) {
                    return ServiceResponse.error(ServiceResponseStatus.INTERNAL_ERROR); //todo změnit response
                }
                String filePath = structuredDirectoryFromId +"/"+ file.getOriginalFilename();
                File dest = new File(filePath);
                file.transferTo(dest);
                workingProductDocument.setFileStatus(FileStatusEnum.UPLOADED);

                workingProductDocument = getRepository().save(workingProductDocument);
                return ServiceResponse.success(workingProductDocument.toDTO());
            } catch (IOException e) {
                e.printStackTrace();
                workingProductDocument.setFileStatus(FileStatusEnum.NOT_UPLOADED);
                getRepository().save(workingProductDocument);
            }
        }

        return ServiceResponse.error(ServiceResponseStatus.INTERNAL_ERROR);  //todo změnit response
    }

    @Override
    public ResponseEntity<?> findByIndex(UUID fileIndex) {
        ProductDocument byIndex = productDocumentRepository.findByIndex(fileIndex);
        return ResponseEntity.ok(byIndex);
    }
}

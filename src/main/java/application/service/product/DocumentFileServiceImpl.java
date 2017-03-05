package application.service.product;

import application.configuration.AppProperties;
import application.persistence.entity.DocumentFile;
import application.persistence.repository.DocumentFileRepository;
import application.rest.domain.DocumentFileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pfilip on 2.3.17.
 */
@Service
public class DocumentFileServiceImpl extends AbstractFileServiceImpl<DocumentFile, DocumentFileRepository, DocumentFileDTO> implements DocumentFileService {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private DocumentFileRepository documentFileRepository;

    @Override
    public DocumentFileRepository getRepository() {
        return documentFileRepository;
    }


    @Override
    public String getStoreLocation() {
        return appProperties.getDocumentStoreLocation();
    }
}

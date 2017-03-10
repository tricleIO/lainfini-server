package application.service.product;

import application.configuration.AppProperties;
import application.persistence.entity.ApplicationFile;
import application.persistence.repository.ApplicationFileRepository;
import application.rest.domain.ApplicationFileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pfilip on 2.3.17.
 */
@Service
public class ApplicationFileServiceImpl extends AbstractFileServiceImpl<ApplicationFile,ApplicationFileRepository,ApplicationFileDTO> implements ApplicationFileService {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private ApplicationFileRepository applicationFileRepository;


    @Override
    public String getStoreLocation() {
        return appProperties.getDocumentStoreLocation();
    }

    @Override
    public ApplicationFileRepository getRepository() {
        return applicationFileRepository;
    }

    @Override
    public ApplicationFile saveEntity(ApplicationFile entity) {
        return getRepository().save(entity);
    }

    @Override
    public ApplicationFile findOne(Long key) {
        return getRepository().findOne(key);
    }
}

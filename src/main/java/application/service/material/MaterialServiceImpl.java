package application.service.material;

import application.persistence.entity.Material;
import application.persistence.repository.MaterialRepository;
import application.rest.domain.MaterialDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl extends BaseDatabaseServiceImpl<Material, Integer, MaterialRepository, MaterialDTO> implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public MaterialRepository getRepository() {
        return materialRepository;
    }

}

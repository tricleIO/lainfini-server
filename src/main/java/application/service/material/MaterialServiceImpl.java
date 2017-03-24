package application.service.material;

import application.persistence.entity.Material;
import application.persistence.repository.MaterialRepository;
import application.rest.domain.MaterialDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.util.SlugMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl extends BaseDatabaseServiceImpl<Material, Integer, MaterialRepository, MaterialDTO> implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    @Override
    protected ServiceResponse<MaterialDTO> doBeforeConvertInCreate(MaterialDTO materialDTO) {
        // if url slug is null, generate it from name
        if (materialDTO.getSlug() != null) {
            if (materialRepository.countBySlug(materialDTO.getSlug()) > 0) {
                return ServiceResponse.error(ServiceResponseStatus.SLUG_ALREADY_EXISTS);
            }
        } else {
            materialDTO.setSlug(
                    SlugMaker.getSlugFromString(materialDTO.getName(), materialRepository)
            );
        }
        return super.doBeforeConvertInCreate(materialDTO);
    }

    @Override
    public MaterialRepository getRepository() {
        return materialRepository;
    }

}

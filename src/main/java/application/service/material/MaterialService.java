package application.service.material;

import application.persistence.SlugService;
import application.persistence.entity.Material;
import application.persistence.repository.MaterialRepository;
import application.rest.domain.MaterialDTO;
import application.service.BaseDatabaseService;

public interface MaterialService extends BaseDatabaseService<Material, Integer, MaterialDTO>, SlugService<Material, MaterialRepository, MaterialDTO> {

}

package application.service.material;

import application.persistence.entity.Material;
import application.persistence.repository.MaterialRepository;
import application.rest.domain.MaterialDTO;
import application.service.BaseDatabaseService;
import application.service.SlugService;

public interface MaterialService extends BaseDatabaseService<Material, Integer, MaterialDTO>, SlugService<Material, MaterialRepository, MaterialDTO> {

}

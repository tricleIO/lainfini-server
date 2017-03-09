package application.service.material;

import application.persistence.entity.Material;
import application.rest.domain.MaterialDTO;
import application.service.BaseDatabaseService;

public interface MaterialService extends BaseDatabaseService<Material, Integer, MaterialDTO> {

}

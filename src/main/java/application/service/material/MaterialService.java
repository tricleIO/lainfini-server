package application.service.material;

import application.persistence.entity.Material;
import application.rest.domain.MaterialDTO;
import application.service.DatabaseServiceInterface;

public interface MaterialService extends DatabaseServiceInterface<Material, Integer, MaterialDTO> {

}

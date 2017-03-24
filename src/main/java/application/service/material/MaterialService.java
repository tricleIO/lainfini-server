package application.service.material;

import application.persistence.SlugService;
import application.persistence.entity.Material;
import application.rest.domain.MaterialDTO;
import application.rest.domain.ProductDTO;
import application.service.BaseDatabaseService;

public interface MaterialService extends BaseDatabaseService<Material, Integer, MaterialDTO>, SlugService<ProductDTO> {

}

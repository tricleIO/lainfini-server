package application.service.material;

import application.persistence.entity.Material;
import application.persistence.repository.MaterialRepository;
import application.rest.domain.MaterialDTO;
import application.service.BaseSoftDeletableDatabaseService;
import application.service.SlugService;

public interface MaterialService extends BaseSoftDeletableDatabaseService<Material, Integer, MaterialDTO>, SlugService<Material, MaterialRepository, MaterialDTO> {

}

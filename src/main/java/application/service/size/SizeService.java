package application.service.size;

import application.persistence.entity.Size;
import application.rest.domain.SizeDTO;
import application.service.BaseDatabaseService;

public interface SizeService extends BaseDatabaseService<Size, Integer, SizeDTO> {

}

package application.service.size;

import application.persistence.entity.Size;
import application.rest.domain.SizeDTO;
import application.service.BaseSoftDeletableDatabaseService;

public interface SizeService extends BaseSoftDeletableDatabaseService<Size, Integer, SizeDTO> {

}

package application.service.size;

import application.persistence.entity.Size;
import application.rest.domain.SizeDTO;
import application.service.DatabaseServiceInterface;

public interface SizeService extends DatabaseServiceInterface<Size, Integer, SizeDTO> {

}

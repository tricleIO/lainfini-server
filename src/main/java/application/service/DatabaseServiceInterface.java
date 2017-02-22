package application.service;

import application.persistence.entity.DTOConvertable;
import application.rest.domain.EntityConvertable;
import application.service.response.ServiceResponse;

import java.io.Serializable;
import java.util.List;

public interface DatabaseServiceInterface<E extends DTOConvertable<D>, I extends Serializable, D extends EntityConvertable<E>> {

    ServiceResponse<D> read(I key);
    ServiceResponse<List<D>> readAll();
    ServiceResponse<D> create(D dto);

}

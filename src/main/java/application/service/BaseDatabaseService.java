package application.service;

import application.persistence.DTOConvertable;
import application.rest.domain.EntityConvertable;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

public interface BaseDatabaseService<E extends DTOConvertable<D>, I extends Serializable, D extends EntityConvertable<E>> {

    ServiceResponse<D> read(I key);
    ServiceResponse<Page<D>> readAll(Pageable pageable);
    ServiceResponse<D> create(D dto);
    ServiceResponse<D> delete(I key);

}

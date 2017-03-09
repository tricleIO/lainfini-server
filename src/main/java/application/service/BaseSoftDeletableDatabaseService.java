package application.service;

import application.persistence.DTOConvertable;
import application.persistence.entity.SoftDeletableEntity;
import application.persistence.type.StatusEnum;
import application.rest.domain.EntityConvertable;
import application.rest.domain.SoftDeletableDTO;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

public interface BaseSoftDeletableDatabaseService<E extends DTOConvertable<D> & SoftDeletableEntity, I extends Serializable, D extends EntityConvertable<E> & SoftDeletableDTO>
        extends BaseDatabaseService<E, I, D> {

    ServiceResponse<Page<D>> readAll(StatusEnum status, Pageable pageable);

}

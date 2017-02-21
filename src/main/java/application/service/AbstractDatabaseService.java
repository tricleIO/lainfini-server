package application.service;

import application.service.response.ServiceResponse;
import application.service.response.Status;
import application.persistence.entity.DTOConvertable;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public abstract class AbstractDatabaseService<E extends DTOConvertable<D>, I extends Serializable, R extends CrudRepository<E, I>, D> implements DatabaseServiceInterface<I, D> {

    public ServiceResponse<D> read(I key) {
        E entity = getRepository().findOne(key);
        if (entity != null) {
            return ServiceResponse.success(entity.toDTO());
        }
        return ServiceResponse.error(Status.NOT_FOUND);
    }

    public abstract R getRepository();

}

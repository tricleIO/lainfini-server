package application.service;

import application.service.response.ServiceResponse;
import application.service.response.Status;
import application.persistence.entity.DTOConvertable;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractDatabaseService<E extends DTOConvertable<D>, I extends Serializable, R extends CrudRepository<E, I>, D>
        implements DatabaseServiceInterface<I, D> {

    public ServiceResponse<D> read(I key) {
        E result = getRepository().findOne(key);
        if (result != null) {
            return ServiceResponse.success(result.toDTO());
        }
        return ServiceResponse.error(Status.NOT_FOUND);
    }

    public ServiceResponse<List<D>> readAll() {
        List<D> responseElements = new LinkedList<>();
        Iterator<E> resultElementsIterator = getRepository().findAll().iterator();
        while (resultElementsIterator.hasNext()) {
            responseElements.add(resultElementsIterator.next().toDTO());
        }
        return ServiceResponse.success(responseElements);
    }

    public abstract R getRepository();

}

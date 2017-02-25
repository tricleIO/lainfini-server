package application.service;

import application.rest.domain.EntityConvertable;
import application.service.response.ServiceResponse;
import application.service.response.Status;
import application.persistence.entity.DTOConvertable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractDatabaseService<E extends DTOConvertable<D>, I extends Serializable, R extends PagingAndSortingRepository<E, I>, D extends EntityConvertable<E>>
        implements DatabaseServiceInterface<E, I, D> {

    public ServiceResponse<D> read(I key) {
        E result = getRepository().findOne(key);
        if (result != null) {
            return ServiceResponse.success(result.toDTO());
        }
        return ServiceResponse.error(Status.NOT_FOUND);
    }

    public ServiceResponse<Page<D>> readAll(Pageable pageable) {
        List<D> responseElements = new LinkedList<>();
        Page<E> page = getRepository().findAll(pageable);
        Iterator<E> iterator = page.getContent().iterator();
        while (iterator.hasNext()) {
            responseElements.add(iterator.next().toDTO());
        }
        Page<D> pageNew = new PageImpl<>(responseElements, pageable, getRepository().count());
        return ServiceResponse.success(pageNew);
    }

    public ServiceResponse<D> create(D dto) {
        E entity = dto.toEntity();
        E savedEntity = getRepository().save(entity);
        return ServiceResponse.success(savedEntity.toDTO());
    }

    public abstract R getRepository();

}

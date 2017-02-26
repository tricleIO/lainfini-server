package application.service;

import application.persistence.EntityToDTOConverter;
import application.rest.domain.EntityConvertable;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.persistence.entity.DTOConvertable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractDatabaseService<E extends DTOConvertable<D>, I extends Serializable, R extends PagingAndSortingRepository<E, I>, D extends EntityConvertable<E>>
        implements DatabaseServiceInterface<E, I, D> {

    public ServiceResponse<D> read(I key) {
        E result = getRepository().findOne(key);
        if (result == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        return ServiceResponse.success(result.toDTO());
    }

    public ServiceResponse<Page<D>> readAll(Pageable pageable) {
        // find all entities
        Page<E> page = getRepository().findAll(pageable);
        // convert entities to DTOs
        EntityToDTOConverter<E, D> converter = new EntityToDTOConverter<>(page.getContent());
        List<D> responseElements = converter.convert();
        // make page from them
        Page<D> pageWithDTOs = new PageImpl<>(responseElements, pageable, getRepository().count());
        return ServiceResponse.success(pageWithDTOs);
    }

    public ServiceResponse<D> create(D dto) {
        E entity = dto.toEntity();
        E savedEntity = getRepository().save(entity);
        return ServiceResponse.success(savedEntity.toDTO());
    }

    public abstract R getRepository();

}

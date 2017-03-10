package application.service;

import application.persistence.DTOConvertable;
import application.persistence.entity.SoftDeletableEntity;
import application.persistence.repository.SoftDeletableRepository;
import application.persistence.type.StatusEnum;
import application.rest.domain.EntityConvertable;
import application.rest.domain.IdentifableDTO;
import application.rest.domain.SoftDeletableDTO;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

public abstract class BaseSoftDeletableDatabaseServiceImpl<E extends DTOConvertable<D> & SoftDeletableEntity, I extends Serializable, R extends PagingAndSortingRepository<E, I> & SoftDeletableRepository<E>, D extends EntityConvertable<E> & IdentifableDTO<I> & SoftDeletableDTO>
        extends BaseDatabaseServiceImpl<E, I, R, D>
        implements BaseSoftDeletableDatabaseService<E, I, D> {

    public ServiceResponse<Page<D>> readAll(Pageable pageable) {
        return readAll(StatusEnum.ACTIVE, pageable);
    }

    public ServiceResponse<Page<D>> readAll(StatusEnum status, Pageable pageable) {
        // find all entities
        Page<E> page = getRepository().findByStatus(status, pageable);
        Page<D> pageWithDTOs = convertPageWithEntitiesToPageWithDtos(page, pageable);
        return ServiceResponse.success(pageWithDTOs);
    }

    public ServiceResponse<D> create(D dto) {
        // deny custom id setting
        dto.setUid(null);
        E entity = dto.toEntity(false);
        entity.setStatus(StatusEnum.ACTIVE);
        E savedEntity = getRepository().save(entity);
        return ServiceResponse.success(savedEntity.toDTO(false));
    }

    public ServiceResponse<D> delete(I key) {
        E result = getRepository().findOne(key);
        if (result == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        result.setStatus(StatusEnum.DELETED);
        E softDeletedEntity = getRepository().save(result);
        return ServiceResponse.success(softDeletedEntity.toDTO(false));
    }

}

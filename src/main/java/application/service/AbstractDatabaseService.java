package application.service;

import application.persistence.DTOConvertable;
import application.persistence.entity.SoftDeletableEntity;
import application.persistence.type.StatusEnum;
import application.rest.domain.EntityConvertable;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractDatabaseService<E extends DTOConvertable<D>, I extends Serializable, R extends PagingAndSortingRepository<E, I>, D extends EntityConvertable<E>>
        implements DatabaseServiceInterface<E, I, D> {

    public ServiceResponse<D> read(I key) {
        E result = getRepository().findOne(key);
        if (result == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        D dto = result.toDTO();
        additionalUpdateDto(dto);
        return ServiceResponse.success(dto);
    }

    public ServiceResponse<Page<D>> readAll(Pageable pageable) {
        // find all entities
        Page<E> page = getRepository().findAll(pageable);
        Page<D> pageWithDTOs = convertPageWithEntitiesToPageWithDtos(page, pageable);
        return ServiceResponse.success(pageWithDTOs);
    }

    public ServiceResponse<D> create(D dto) {
        E entity = dto.toEntity();
        if (entity instanceof SoftDeletableEntity) {
            ((SoftDeletableEntity) entity).setStatus(StatusEnum.ACTIVE);
        }
        E savedEntity = getRepository().save(entity);
        return ServiceResponse.success(savedEntity.toDTO());
    }

    public ServiceResponse<D> delete(I key) {
        E result = getRepository().findOne(key);
        if (result == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        D dto = result.toDTO();
        if (result instanceof SoftDeletableEntity) {
            ((SoftDeletableEntity) result).setStatus(StatusEnum.DELETED);
            getRepository().save(result);
        } else {
            getRepository().delete(key);
        }
        return ServiceResponse.success(dto);
    }

    protected Page<D> convertPageWithEntitiesToPageWithDtos(Page<E> page, Pageable pageable) {
        List<D> dtoList = new LinkedList<>();
        for (E currentEntity : page.getContent()) {
            D currentDTO = currentEntity.toDTO();
            additionalUpdateDto(currentDTO);
            dtoList.add(currentDTO);
        }
        // make page from them
        return new PageImpl<>(dtoList, pageable, getRepository().count());
    }

    protected void additionalUpdateDto(D dto) {
        // empty here, can override in children
    }

    public abstract R getRepository();

}

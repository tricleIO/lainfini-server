package application.service;

import application.persistence.DTOConvertable;
import application.rest.domain.EntityConvertable;
import application.rest.domain.IdentifableDTO;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public abstract class BaseDatabaseServiceImpl<E extends DTOConvertable<D>, I extends Serializable, R extends PagingAndSortingRepository<E, I>, D extends EntityConvertable<E> & IdentifableDTO<I>>
        implements BaseDatabaseService<E, I, D> {

    public ServiceResponse<D> read(I key) {
        E result = getRepository().findOne(key);
        if (result == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        D dto = result.toDTO(true);
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
        ServiceResponseStatus status = getCreateAdditionalDataLoaderBatch(dto).tryReadAll();
        if (status != ServiceResponseStatus.OK) {
            return ServiceResponse.error(status);
        }
        beforeCreate(dto);
        E entity = dto.toEntity(true);
        E savedEntity = getRepository().save(entity);
        return ServiceResponse.success(savedEntity.toDTO(true));
    }

    protected void beforeCreate(D dto) {
    }

    protected AdditionalDataManipulatorBatch<D> getCreateAdditionalDataLoaderBatch(D dto) {
        return new AdditionalDataManipulatorBatch(dto);
    }

    public ServiceResponse<D> patch(D dto) {
        if (!getRepository().exists(dto.getUid())) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        E entity = dto.toEntity(true);
        E patchedEntity = getRepository().save(entity);
        return ServiceResponse.success(patchedEntity.toDTO(true));
    }

    public ServiceResponse<D> delete(I key) {
        E result = getRepository().findOne(key);
        if (result == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        D dto = result.toDTO(true);
        getRepository().delete(key);
        return ServiceResponse.success(dto);
    }

    protected Page<D> convertPageWithEntitiesToPageWithDtos(Page<E> page, Pageable pageable) {
        List<D> dtoList = new LinkedList<>();
        for (E currentEntity : page.getContent()) {
            D currentDTO = currentEntity.toDTO(true);
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

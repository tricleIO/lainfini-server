package application.service;

import application.persistence.DTOConvertable;
import application.persistence.SlugService;
import application.persistence.repository.SlugRepository;
import application.rest.domain.EntityConvertable;
import application.rest.domain.IdentifableDTO;
import application.rest.domain.SlugDTO;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.util.BeanCopier;
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
        // before convert to entity
        ServiceResponse<D> beforeConvertResponse = doBeforeConvertInCreate(dto);
        if (!beforeConvertResponse.isSuccessful()) {
            return beforeConvertResponse;
        }
        // load additional info to DTO
        ServiceResponseStatus status = getAdditionalDataLoaderBatch(dto).tryReadAll();
        if (status != ServiceResponseStatus.OK) {
            return ServiceResponse.error(status);
        }
        // slug generation
        if (this instanceof SlugService && dto instanceof SlugDTO && getRepository() instanceof SlugRepository) {
            SlugService<SlugDTO> slugService = (SlugService) this;
            SlugDTO slugDTO = (SlugDTO) dto;
            SlugRepository slugRepository = (SlugRepository) getRepository();
            ServiceResponse generateSlugResponse = slugService.generateSlugAndSetItToDTO(slugDTO, slugRepository);
            if (!generateSlugResponse.isSuccessful()) {
                return ServiceResponse.error(generateSlugResponse.getStatus());
            }
        }
        // convert to entity
        E entity = dto.toEntity(true);
        // additional update of entity
        doAfterConvertInCreate(entity);
        // save entity
        E savedEntity = getRepository().save(entity);
        // after save
        doAfterCreate(entity);
        return ServiceResponse.success(savedEntity.toDTO(true));
    }

    protected ServiceResponse<D> doBeforeConvertInCreate(D dto) {
        return ServiceResponse.success(dto);
    }

    protected void doAfterConvertInCreate(E entity) {
    }

    protected void doAfterCreate(E entity) {
    }

    protected AdditionalDataManipulatorBatch<D> getAdditionalDataLoaderBatch(D dto) {
        return new AdditionalDataManipulatorBatch(dto);
    }

    public ServiceResponse<D> patch(D dto) {
        // find record
        E originalEntity = getRepository().findOne(dto.getUid());
        if (originalEntity == null) {
            return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
        }
        // load additional info to DTO
        ServiceResponseStatus status = getAdditionalDataLoaderBatch(dto).tryReadAll();
        if (status != ServiceResponseStatus.OK) {
            return ServiceResponse.error(status);
        }
        // update
        E updatingEntity = dto.toEntity(true);
        BeanCopier.copyNonNullProperties(updatingEntity, originalEntity);
        E patchedEntity = getRepository().save(originalEntity);
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

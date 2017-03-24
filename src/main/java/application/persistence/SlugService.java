package application.persistence;

import application.persistence.entity.SlugEntity;
import application.persistence.repository.SlugRepository;
import application.rest.domain.ReadWriteDatabaseDTO;
import application.rest.domain.SlugDTO;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.util.SlugMaker;

public interface SlugService<E extends SlugEntity & DTOConvertable<D>, R extends SlugRepository<E>, D extends SlugDTO & ReadWriteDatabaseDTO<E>> {

    default ServiceResponse<D> generateSlugAndSetItToDTO(D dto) {
        // if url slug is null, generate it from name
        // @TODO - write some generic code (interface with repository and generic DTO) for this (product, material, this...)
        if (dto.getSlug() != null) {
            if (getRepository().countBySlug(dto.getSlug()) > 0) {
                return ServiceResponse.error(ServiceResponseStatus.SLUG_ALREADY_EXISTS);
            }
        } else {
            dto.setSlug(
                    SlugMaker.getSlugFromString(dto.slugFrom(), getRepository())
            );
        }
        return ServiceResponse.success(dto);
    }

    default ServiceResponse<D> readBySlug(String slug) {
        E entity = getRepository().findOneBySlug(slug);
        if (entity == null) {
            return ServiceResponse.error(ServiceResponseStatus.OBJECT_BY_SLUG_NOT_FOUND);
        }
        return ServiceResponse.success(entity.toDTO(true));
    }

    R getRepository();

}

package application.persistence;

import application.persistence.repository.SlugRepository;
import application.rest.domain.SlugDTO;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import application.util.SlugMaker;

public interface SlugService<D extends SlugDTO> {

    default ServiceResponse<D> generateSlugAndSetItToDTO(D dto, SlugRepository slugRepository) {
        // if url slug is null, generate it from name
        // @TODO - write some generic code (interface with repository and generic DTO) for this (product, material, this...)
        if (dto.getSlug() != null) {
            if (slugRepository.countBySlug(dto.getSlug()) > 0) {
                return ServiceResponse.error(ServiceResponseStatus.SLUG_ALREADY_EXISTS);
            }
        } else {
            dto.setSlug(
                    SlugMaker.getSlugFromString(dto.slugFrom(), slugRepository)
            );
        }
        return ServiceResponse.success(dto);
    }

}

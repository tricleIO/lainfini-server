package application.service;

import application.persistence.DTOConvertable;
import application.persistence.entity.SlugEntity;
import application.persistence.repository.SlugRepository;
import application.rest.domain.ReadWriteDatabaseDTO;
import application.rest.domain.SlugDTO;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;

public interface SlugService<E extends SlugEntity & DTOConvertable<D>, R extends SlugRepository<E>, D extends SlugDTO & ReadWriteDatabaseDTO<E>> {

    default ServiceResponse<D> generateSlugAndSetItToDTO(D dto) {
        // if url slug is null, generate it from name
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

    class SlugMaker {

        public static <E extends SlugEntity & DTOConvertable<D>, R extends SlugRepository<E>, D extends SlugDTO & ReadWriteDatabaseDTO<E>>
        String getSlugFromString(String string, R slugRepository) {
            // get slug from transformed string to lower case, remove spaces
            final String slug = string.replaceAll("\\s+", "-").toLowerCase();
            // same slug is already in database
            if (slugAlreadyExists(slug, slugRepository)) {
                // count postfixed slugs
                final Long countSimilarSlugs = slugRepository.countBySlugStartingWith(slug + "_");
                // try new slug postfix is dependent on count of previous slug postfix
                Long slugPostfix = countSimilarSlugs + 1;
                // if already exists
                while (slugAlreadyExists(getPostfixedSlug(slug, slugPostfix), slugRepository)) {
                    // try increasing postfix until it is unique
                    slugPostfix++;
                }
                return getPostfixedSlug(slug, slugPostfix);
            }
            return slug;
        }

        private static <E extends SlugEntity & DTOConvertable<D>, R extends SlugRepository<E>, D extends SlugDTO & ReadWriteDatabaseDTO<E>>
        boolean slugAlreadyExists(String slug, R slugRepository) {
            return slugRepository.countBySlug(slug) > 0;
        }

        private static String getPostfixedSlug(String slug, Long postfix) {
            return slug + "_" + postfix;
        }

    }

}

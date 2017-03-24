package application.persistence.repository;

import application.persistence.entity.SlugEntity;

public interface SlugRepository<E extends SlugEntity> {

    Long countBySlug(String slug);
    Long countBySlugStartingWith(String slug);
    E findOneBySlug(String slug);

}

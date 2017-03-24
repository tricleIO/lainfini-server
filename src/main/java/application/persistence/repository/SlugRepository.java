package application.persistence.repository;

public interface SlugRepository {

    Long countBySlug(String slug);
    Long countBySlugStartingWith(String slug);

}

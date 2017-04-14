package application.persistence.repository;

import application.persistence.entity.Technology;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TechnologyRepository extends PagingAndSortingRepository<Technology, Integer> {

}
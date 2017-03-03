package application.persistence.repository;

import application.persistence.entity.Flash;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FlashRepository extends PagingAndSortingRepository<Flash, Integer> {

}
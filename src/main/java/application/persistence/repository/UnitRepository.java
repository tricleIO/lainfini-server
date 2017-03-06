package application.persistence.repository;

import application.persistence.entity.Unit;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UnitRepository extends PagingAndSortingRepository<Unit, Integer> {

}
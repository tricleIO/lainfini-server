package application.persistence.repository;

import application.persistence.entity.Material;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MaterialRepository extends PagingAndSortingRepository<Material, Integer> {

}
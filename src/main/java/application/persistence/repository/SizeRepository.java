package application.persistence.repository;

import application.persistence.entity.Size;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SizeRepository extends PagingAndSortingRepository<Size, Integer> {

}
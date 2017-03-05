package application.persistence.repository;

import application.persistence.entity.CallToAction;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CallToActionRepository extends PagingAndSortingRepository<CallToAction, Integer> {

}
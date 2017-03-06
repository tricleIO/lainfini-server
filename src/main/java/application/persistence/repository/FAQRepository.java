package application.persistence.repository;

import application.persistence.entity.FAQ;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FAQRepository extends PagingAndSortingRepository<FAQ, Integer> {

}
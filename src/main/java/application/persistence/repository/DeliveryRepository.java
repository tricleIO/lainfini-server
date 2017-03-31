package application.persistence.repository;

import application.persistence.entity.Delivery;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeliveryRepository extends PagingAndSortingRepository<Delivery, Long> {

}
package application.persistence.repository;

import application.persistence.entity.ShippingAvailability;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShippingAvailabilityRepository extends PagingAndSortingRepository<ShippingAvailability, Integer> {

}
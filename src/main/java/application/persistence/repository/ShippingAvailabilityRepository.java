package application.persistence.repository;

import application.persistence.entity.ShippingAvailability;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShippingAvailabilityRepository extends PagingAndSortingRepository<ShippingAvailability, Integer> {

    Page<ShippingAvailability> findByRegionCountriesId(Integer countryId, Pageable pageable);
    Page<ShippingAvailability> findByRegionCountriesCode(String countryCode, Pageable pageable);

}
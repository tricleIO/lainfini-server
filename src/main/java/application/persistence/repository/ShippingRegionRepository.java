package application.persistence.repository;

import application.persistence.entity.ShippingRegion;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShippingRegionRepository extends PagingAndSortingRepository<ShippingRegion, Integer>, SoftDeletableRepository<ShippingRegion> {

}
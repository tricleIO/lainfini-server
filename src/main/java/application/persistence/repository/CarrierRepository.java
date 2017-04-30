package application.persistence.repository;

import application.persistence.entity.Carrier;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarrierRepository extends PagingAndSortingRepository<Carrier, Integer>, SoftDeletableRepository<Carrier> {

}
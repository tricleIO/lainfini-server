package application.persistence.repository;

import application.persistence.entity.ShippingTariff;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShippingTariffRepository extends PagingAndSortingRepository<ShippingTariff, Integer> {

}
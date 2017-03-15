package application.persistence.repository;

import application.persistence.entity.PaymentMethod;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentMethodRepository extends PagingAndSortingRepository<PaymentMethod, Integer> {

}
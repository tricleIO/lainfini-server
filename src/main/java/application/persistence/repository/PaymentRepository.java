package application.persistence.repository;

import application.persistence.entity.Payment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentRepository extends PagingAndSortingRepository<Payment, Long> {

}
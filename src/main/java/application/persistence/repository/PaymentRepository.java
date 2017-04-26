package application.persistence.repository;

import application.persistence.entity.Payment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface PaymentRepository extends PagingAndSortingRepository<Payment, Long> {

    List<Payment> findByOrderId(UUID orderId);
    Page<Payment> findByOrderId(UUID orderId, Pageable pageable);

}
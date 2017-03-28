package application.persistence.repository;

import application.persistence.entity.OrderItem;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface OrderItemRepository extends PagingAndSortingRepository<OrderItem, Long> {

    List<OrderItem> findByOrderId(UUID orderId);

}
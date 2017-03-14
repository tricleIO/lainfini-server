package application.persistence.repository;

import application.persistence.entity.OrderItem;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderItemRepository extends PagingAndSortingRepository<OrderItem, Long> {

}
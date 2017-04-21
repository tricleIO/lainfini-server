package application.persistence.repository;

import application.persistence.entity.StockItem;
import application.persistence.type.StockItemStateEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface StockItemRepository extends PagingAndSortingRepository<StockItem, Long> {

    StockItem findFirstByProductIdAndState(UUID productId, StockItemStateEnum state);
    Page<StockItem> findByProductIdAndSerialNumberInAndState(UUID productId, List<String> serialNumber, StockItemStateEnum state, Pageable pageable);
    Page<StockItem> findByState(StockItemStateEnum state, Pageable pageable);
    Page<StockItem> findByProductId(UUID productId, Pageable pageable);
    Page<StockItem> findByProductIdAndState(UUID productId, StockItemStateEnum state, Pageable pageable);
    Long countByProductId(UUID productId);
    Long countByProductIdAndState(UUID productId, StockItemStateEnum state);

}
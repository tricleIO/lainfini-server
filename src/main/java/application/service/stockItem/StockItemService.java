package application.service.stockItem;

import application.persistence.entity.StockItem;
import application.rest.domain.StockItemDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface StockItemService extends BaseDatabaseService<StockItem, Long, StockItemDTO> {

    ServiceResponse<Page<StockItemDTO>> readStockedItems(Pageable pageable);
    ServiceResponse<Page<StockItemDTO>> readProductStockedItems(UUID productUid, Pageable pageable);
    ServiceResponse<Long> countProductsInStock(UUID productUid);
    ServiceResponse<Long> countAllTimeStockedProducts(UUID productUid);

}

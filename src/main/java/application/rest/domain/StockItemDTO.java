package application.rest.domain;

import application.persistence.entity.StockItem;
import application.persistence.type.StockItemStateEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockItemDTO implements ReadWriteDatabaseDTO<StockItem>, IdentifableDTO<Long> {

    private Long uid;
    private UUID productUid;
    private String serialNumber;
    private Date addedAt;
    private UUID userUid;
    private StockItemStateEnum state;
    private UUID orderUid;

    private ProductDTO product;
    private UserDTO user;
    private OrderDTO order;

    @Override
    public StockItem toEntity(boolean selectAsParent, Object... parentParams) {
        StockItem stockItem = new StockItem();
        stockItem.setId(uid);
        stockItem.setAddedAt(addedAt);
        stockItem.setSerialNumber(serialNumber);
        stockItem.setState(state);
        if (selectAsParent) {
            if (product != null) {
                stockItem.setProduct(product.toEntity(false));
            }
            if (user != null) {
                stockItem.setUser(user.toEntity(false));
            }
            if (order != null) {
                stockItem.setOrder(order.toEntity(false));
            }
        }
        return stockItem;
    }
}

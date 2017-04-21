package application.rest.domain;

import application.persistence.entity.StockItem;
import application.persistence.type.StockItemStateEnum;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class StockItemDTO implements ReadWriteDatabaseDTO<StockItem>, IdentifableDTO<Long> {

    private Long uid;
    private UUID productUid;
    private String serialNumber;
    private Date addedAt;
    private UUID userUid;
    private StockItemStateEnum state;

    private ProductDTO product;
    private UserDTO user;

    @Override
    public StockItem toEntity(boolean selectAsParent, Object... parentParams) {
        StockItem stockItem = new StockItem();
        stockItem.setId(uid);
//        stockItem.setAddedAt(new Date());
        stockItem.setSerialNumber(serialNumber);
//        stockItem.setState();
        if (selectAsParent) {
            if (product != null) {
                stockItem.setProduct(product.toEntity(false));
            }
            if (user != null) {
                stockItem.setUser(user.toEntity(false));
            }
        }
        return stockItem;
    }
}

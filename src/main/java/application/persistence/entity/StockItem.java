package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.StockItemStateEnum;
import application.rest.domain.StockItemDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class StockItem implements DTOConvertable<StockItemDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private Product product;

    private String serialNumber;

    private Date addedAt;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @Enumerated(EnumType.ORDINAL)
    private StockItemStateEnum state;

    @ManyToOne
    @JoinColumn(name = "customer_order_id", referencedColumnName = "id")
    private CustomerOrder order;

    @ManyToOne
    @JoinColumn(name = "stock_id", referencedColumnName = "id", nullable = false)
    private Stock stock;

    @Override
    public StockItemDTO toDTO(boolean selectAsParent, Object... parentParams) {
        StockItemDTO stockItemDTO = new StockItemDTO();
        stockItemDTO.setUid(id);
        if (product != null) {
            stockItemDTO.setProductUid(product.getId());
        }
        stockItemDTO.setSerialNumber(serialNumber);
        stockItemDTO.setAddedAt(addedAt);
        if (user != null) {
            stockItemDTO.setUserUid(user.getId());
        }
        if (order != null) {
            stockItemDTO.setOrderUid(order.getId());
        }
        if (stock != null) {
            stockItemDTO.setStockUid(stock.getId());
        }
        stockItemDTO.setState(state);
        return stockItemDTO;
    }

}

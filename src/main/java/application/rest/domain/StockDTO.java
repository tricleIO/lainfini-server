package application.rest.domain;

import application.persistence.entity.Stock;
import application.persistence.type.StockPriority;
import lombok.Data;

@Data
public class StockDTO implements ReadWriteDatabaseDTO<Stock>, IdentifableDTO<Integer> {

    private Integer uid;
    private String location;
    private StockPriority priority;

    @Override
    public Stock toEntity(boolean selectAsParent, Object... parentParams) {
        Stock stock = new Stock();
        stock.setId(uid);
        stock.setLocation(location);
        stock.setPriority(priority);
        return stock;
    }

}

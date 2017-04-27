package application.rest.domain;

import application.persistence.entity.Stock;
import lombok.Data;

@Data
public class StockDTO implements ReadWriteDatabaseDTO<Stock>, IdentifableDTO<Integer> {

    private Integer uid;
    private String location;

    @Override
    public Stock toEntity(boolean selectAsParent, Object... parentParams) {
        Stock stock = new Stock();
        stock.setId(uid);
        stock.setLocation(location);
        return stock;
    }

}

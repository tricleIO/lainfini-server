package application.service.stock;

import application.persistence.entity.Stock;
import application.rest.domain.StockDTO;
import application.service.BaseDatabaseService;

public interface StockService extends BaseDatabaseService<Stock, Integer, StockDTO> {

}

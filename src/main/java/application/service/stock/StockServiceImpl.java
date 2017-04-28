package application.service.stock;

import application.persistence.entity.Stock;
import application.persistence.repository.StockRepository;
import application.rest.domain.StockDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl extends BaseDatabaseServiceImpl<Stock, Integer, StockRepository, StockDTO> implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public StockRepository getRepository() {
        return stockRepository;
    }

}

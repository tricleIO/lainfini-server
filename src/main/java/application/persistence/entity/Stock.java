package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.StockDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Stock implements DTOConvertable<StockDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String location;

    @Override
    public StockDTO toDTO(boolean selectAsParent, Object... parentParams) {
        StockDTO stockDTO = new StockDTO();
        stockDTO.setUid(id);
        stockDTO.setLocation(location);
        return stockDTO;
    }

}

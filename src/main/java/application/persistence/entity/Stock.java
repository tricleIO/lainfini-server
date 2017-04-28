package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.StockPriority;
import application.rest.domain.StockDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Stock implements DTOConvertable<StockDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String location;

    @Enumerated(EnumType.ORDINAL)
    private StockPriority priority;

    @Override
    public StockDTO toDTO(boolean selectAsParent, Object... parentParams) {
        StockDTO stockDTO = new StockDTO();
        stockDTO.setUid(id);
        stockDTO.setLocation(location);
        stockDTO.setPriority(priority);
        return stockDTO;
    }

}

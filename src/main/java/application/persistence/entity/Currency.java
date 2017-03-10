package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.CurrencySymbolPlacementEnum;
import application.rest.domain.CurrencyDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Currency implements DTOConvertable<CurrencyDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String symbol;

    @Enumerated(EnumType.ORDINAL)
    private CurrencySymbolPlacementEnum symbolPlacement;

    @Override
    public CurrencyDTO toDTO(boolean selectAsParent) {
        CurrencyDTO currencyDTO = new CurrencyDTO();
        currencyDTO.setUid(id);
        currencyDTO.setName(name);
        currencyDTO.setSymbol(symbol);
        currencyDTO.setSymbolPlacement(symbolPlacement);
        return  currencyDTO;
    }

}

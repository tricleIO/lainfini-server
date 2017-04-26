package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.CurrencySymbolPlacementEnum;
import application.rest.domain.CurrencyDTO;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Audited
@Data
@Entity
public class Currency implements DTOConvertable<CurrencyDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "symbol", nullable = false)
    private String symbol;

    @Enumerated(EnumType.ORDINAL)
    private CurrencySymbolPlacementEnum symbolPlacement;

    @Override
    public CurrencyDTO toDTO(boolean selectAsParent, Object... parentParams) {
        CurrencyDTO currencyDTO = new CurrencyDTO();
        currencyDTO.setUid(id);
        currencyDTO.setName(name);
        currencyDTO.setSymbol(symbol);
        currencyDTO.setSymbolPlacement(symbolPlacement);
        return  currencyDTO;
    }

}

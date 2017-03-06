package application.rest.domain;

import application.persistence.entity.Currency;
import application.persistence.type.CurrencySymbolPlacementEnum;
import lombok.Data;

@Data
public class CurrencyDTO implements ReadWriteDatabaseDTO<Currency> {

    private Integer uid;
    private String name;
    private String symbol;
    private CurrencySymbolPlacementEnum symbolPlacement;

    @Override
    public Currency toEntity() {
        Currency currency = new Currency();
        currency.setId(uid);
        currency.setName(name);
        currency.setSymbol(symbol);
        currency.setSymbolPlacement(symbolPlacement);
        return currency;
    }
}

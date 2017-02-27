package application.persistence.type;

public enum CurrencyEnum {

    CZK("koruna", "Kč"),
    USD("dollar", "$");

    private String name;
    private String symbol;

    CurrencyEnum(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}

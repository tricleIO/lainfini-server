package application.persistence.type;

public enum Currency {

    CZK("koruna", "Kč"),
    USD("dollar", "$");

    private String name;
    private String symbol;

    Currency(String name, String symbol) {
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

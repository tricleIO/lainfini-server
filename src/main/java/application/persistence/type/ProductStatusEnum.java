package application.persistence.type;

public enum ProductStatusEnum {
    IN_STOCK,
    OUT_OF_STOCK;

    public static ProductStatusEnum getProductStatus(long productCount) {
        if (productCount > 0) {
            return IN_STOCK;
        }
        return OUT_OF_STOCK;
    }

}

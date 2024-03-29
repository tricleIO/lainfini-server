package application.rest.domain;

import application.persistence.entity.Delivery;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ShippingDTO implements ReadWriteDatabaseDTO<Delivery>, IdentifableDTO<Long> {

    private Long uid;
    private String trackingNumber;
    private Integer shippingTariffUid;
    private BigDecimal price;
    private Integer currencyUid;
    private Date shippedAt;

    private CurrencyDTO currency;
    private ShippingTariffDTO shippingTariff;

    @Override
    public Delivery toEntity(boolean selectAsParent, Object... parentParams) {
        Delivery delivery = new Delivery();
        delivery.setId(uid);
        delivery.setTrackingNumber(trackingNumber);
        delivery.setPrice(price);
        if (selectAsParent) {
            if (currency != null) {
                delivery.setCurrency(currency.toEntity(false));
            }
            if (shippingTariff != null) {
                delivery.setShippingTariff(shippingTariff.toEntity(false));
            }
        }
        return delivery;
    }

}

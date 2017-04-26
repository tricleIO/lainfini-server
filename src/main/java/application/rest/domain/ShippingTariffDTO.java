package application.rest.domain;

import application.persistence.entity.ShippingTariff;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShippingTariffDTO implements ReadWriteDatabaseDTO<ShippingTariff>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private String code;
    private String slug;
    private Long iconUid;
    private Integer carrierUid;
    private BigDecimal price;
    private Integer currencyUid;
    private String deliveryTime;

    private CurrencyDTO currency;
    private CarrierDTO carrier;
    private ApplicationFileDTO icon;

    @Override
    public ShippingTariff toEntity(boolean selectAsParent, Object... parentParams) {
        ShippingTariff shippingTariff = new ShippingTariff();
        shippingTariff.setId(uid);
        shippingTariff.setName(name);
        shippingTariff.setCode(code);
        shippingTariff.setSlug(slug);
        shippingTariff.setPrice(price);
        shippingTariff.setDeliveryTime(deliveryTime);
        if (selectAsParent) {
            if (currency != null) {
                shippingTariff.setCurrency(currency.toEntity(false));
            }
            if (carrier != null) {
                shippingTariff.setCarrier(carrier.toEntity(false));
            }
            if (icon != null) {
                shippingTariff.setIcon(icon.toEntity(false));
            }
        }
        return shippingTariff;
    }
}

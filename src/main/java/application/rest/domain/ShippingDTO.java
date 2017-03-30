package application.rest.domain;

import application.persistence.entity.Delivery;
import lombok.Data;

@Data
public class ShippingDTO implements ReadWriteDatabaseDTO<Delivery>, IdentifableDTO<Long> {

    private Long uid;
    private String trackingNumber;
    private Integer shippingTariffUid;

    private ShippingTariffDTO shippingTariff;

    @Override
    public Delivery toEntity(boolean selectAsParent, Object... parentParams) {
        Delivery delivery = new Delivery();
        delivery.setId(uid);
        delivery.setTrackingNumber(trackingNumber);
        if (selectAsParent) {
            if (shippingTariff != null) {
                delivery.setShippingTariff(shippingTariff.toEntity(false));
            }
        }
        return delivery;
    }

}

package application.rest.domain;

import application.persistence.entity.ShippingAvailability;
import lombok.Data;

@Data
public class ShippingAvailabilityDTO implements ReadWriteDatabaseDTO<ShippingAvailability>, IdentifableDTO<Integer> {

    private Integer uid;
    private Integer tariffUid;
    private Integer regionUid;

    private ShippingTariffDTO tariff;
    private ShippingRegionDTO region;

    @Override
    public ShippingAvailability toEntity(boolean selectAsParent, Object... parentParams) {
        ShippingAvailability shippingTariffHasRegion = new ShippingAvailability();
        shippingTariffHasRegion.setId(uid);
        if (selectAsParent) {
            if (tariff != null) {
                shippingTariffHasRegion.setTariff(tariff.toEntity(false));
            }
            if (region != null) {
                shippingTariffHasRegion.setRegion(region.toEntity(false));
            }
        }
        return shippingTariffHasRegion;
    }

}

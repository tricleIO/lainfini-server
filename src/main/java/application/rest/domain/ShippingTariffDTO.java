package application.rest.domain;

import application.persistence.entity.ShippingTariff;
import lombok.Data;

@Data
public class ShippingTariffDTO implements ReadWriteDatabaseDTO<ShippingTariff>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private String code;
    private String slug;
    private Long iconUid;
    private Integer carrierUid;

    private CarrierDTO carrier;
    private ApplicationFileDTO icon;

    @Override
    public ShippingTariff toEntity(boolean selectAsParent, Object... parentParams) {
        ShippingTariff shippingTariff = new ShippingTariff();
        shippingTariff.setId(uid);
        shippingTariff.setName(name);
        shippingTariff.setCode(code);
        shippingTariff.setSlug(slug);
        if (selectAsParent) {
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

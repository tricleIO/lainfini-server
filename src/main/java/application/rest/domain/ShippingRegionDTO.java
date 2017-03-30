package application.rest.domain;

import application.persistence.entity.ShippingRegion;
import lombok.Data;

@Data
public class ShippingRegionDTO implements ReadWriteDatabaseDTO<ShippingRegion>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private String code;

    @Override
    public ShippingRegion toEntity(boolean selectAsParent, Object... parentParams) {
        ShippingRegion shippingRegion = new ShippingRegion();
        shippingRegion.setId(uid);
        shippingRegion.setName(name);
        shippingRegion.setCode(code);
        return shippingRegion;
    }

}

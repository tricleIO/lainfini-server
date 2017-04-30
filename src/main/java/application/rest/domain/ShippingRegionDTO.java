package application.rest.domain;

import application.persistence.entity.ShippingRegion;
import application.persistence.type.StatusEnum;
import lombok.Data;

@Data
public class ShippingRegionDTO implements ReadWriteDatabaseDTO<ShippingRegion>, SoftDeletableDTO, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private String code;
    private StatusEnum status;

    @Override
    public ShippingRegion toEntity(boolean selectAsParent, Object... parentParams) {
        ShippingRegion shippingRegion = new ShippingRegion();
        shippingRegion.setId(uid);
        shippingRegion.setName(name);
        shippingRegion.setCode(code);
        shippingRegion.setStatus(status);
        return shippingRegion;
    }

}

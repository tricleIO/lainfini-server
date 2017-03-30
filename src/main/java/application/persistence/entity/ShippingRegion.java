package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ShippingRegionDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class ShippingRegion implements DTOConvertable<ShippingRegionDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String code;

    @Override
    public ShippingRegionDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ShippingRegionDTO shippingRegionDTO = new ShippingRegionDTO();
        shippingRegionDTO.setUid(id);
        shippingRegionDTO.setName(name);
        shippingRegionDTO.setCode(code);
        return shippingRegionDTO;
    }

}

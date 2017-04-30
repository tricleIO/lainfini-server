package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ShippingAvailabilityDTO;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Audited
@Entity
@Data
public class ShippingAvailability implements DTOConvertable<ShippingAvailabilityDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "shipping_tariff_id", referencedColumnName = "id")
    private ShippingTariff tariff;

    @ManyToOne
    @JoinColumn(name = "shipping_region_id", referencedColumnName = "id")
    private ShippingRegion region;

    @Override
    public ShippingAvailabilityDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ShippingAvailabilityDTO shippingAvailabilityDTO = new ShippingAvailabilityDTO();
        shippingAvailabilityDTO.setUid(id);
        if (tariff != null) {
            shippingAvailabilityDTO.setTariffUid(tariff.getId());
        }
        if (region != null) {
            shippingAvailabilityDTO.setRegionUid(region.getId());
        }
        return shippingAvailabilityDTO;
    }

}

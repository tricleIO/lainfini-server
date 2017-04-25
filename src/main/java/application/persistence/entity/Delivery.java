package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ShippingDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Delivery implements DTOConvertable<ShippingDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "shipping_tariff_id", referencedColumnName = "id")
    private ShippingTariff shippingTariff;

    @Column(precision = 11, scale = 2)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;

    private String trackingNumber;

    private Date shippedAt;

    @Override
    public ShippingDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ShippingDTO deliveryDTO = new ShippingDTO();
        deliveryDTO.setUid(id);
        deliveryDTO.setTrackingNumber(trackingNumber);
        deliveryDTO.setPrice(price);
        deliveryDTO.setShippedAt(shippedAt);
        if (currency != null) {
            deliveryDTO.setCurrency(currency.toDTO(false));
        }
        if (shippingTariff != null) {
            deliveryDTO.setShippingTariffUid(shippingTariff.getId());
        }
        if (shippingTariff != null) {
            deliveryDTO.setShippingTariff(shippingTariff.toDTO(false));
        }
        return deliveryDTO;
    }

}

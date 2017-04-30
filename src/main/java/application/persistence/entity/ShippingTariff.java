package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ShippingTariffDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Audited
@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingTariff extends SoftDeletableEntityImpl implements DTOConvertable<ShippingTariffDTO>, SoftDeletableEntity, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String code;

    private String slug;

    @ManyToOne
    @JoinColumn(name = "carrier_id", referencedColumnName = "id")
    private Carrier carrier;

    @Column(precision = 11, scale = 2)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;

    @NotAudited
    @OneToOne
    @JoinColumn(name = "icon_image_id", referencedColumnName = "id")
    private ApplicationFile icon;

    private String deliveryTime;

    @Override
    public ShippingTariffDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ShippingTariffDTO shippingTariffDTO = new ShippingTariffDTO();
        shippingTariffDTO.setUid(id);
        shippingTariffDTO.setName(name);
        shippingTariffDTO.setCode(code);
        shippingTariffDTO.setSlug(slug);
        shippingTariffDTO.setPrice(price);
        shippingTariffDTO.setDeliveryTime(deliveryTime);
        if (carrier != null) {
            shippingTariffDTO.setCarrierUid(carrier.getId());
        }
        if (selectAsParent) {
            if (currency != null) {
                shippingTariffDTO.setCurrency(currency.toDTO(false));
            }
            if (icon != null) {
                shippingTariffDTO.setIcon(icon.toDTO(false));
            }
        }
        return shippingTariffDTO;
    }

}

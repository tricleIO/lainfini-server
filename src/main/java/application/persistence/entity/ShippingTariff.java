package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ShippingTariffDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingTariff implements DTOConvertable<ShippingTariffDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String code;

    private String slug;

    @ManyToOne
    @JoinColumn(name = "carrier_id", referencedColumnName = "id")
    private Carrier carrier;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;

    @OneToOne
    @JoinColumn(name = "icon_image_id", referencedColumnName = "id")
    private ApplicationFile icon;

    @Override
    public ShippingTariffDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ShippingTariffDTO shippingTariffDTO = new ShippingTariffDTO();
        shippingTariffDTO.setUid(id);
        shippingTariffDTO.setName(name);
        shippingTariffDTO.setCode(code);
        shippingTariffDTO.setSlug(slug);
        shippingTariffDTO.setPrice(price);
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

package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.CarrierDTO;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;
import java.io.Serializable;

@Audited
@Entity
@Data
public class Carrier implements DTOConvertable<CarrierDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String slug;

    private String trackingEndpoint;

    @NotAudited
    @OneToOne
    @JoinColumn(name = "logo_image_id", referencedColumnName = "id")
    private ApplicationFile logo;

    @Override
    public CarrierDTO toDTO(boolean selectAsParent, Object... parentParams) {
        CarrierDTO carrierDTO = new CarrierDTO();
        carrierDTO.setUid(id);
        carrierDTO.setName(name);
        carrierDTO.setSlug(slug);
        carrierDTO.setTrackingEndpoint(trackingEndpoint);
        if (selectAsParent) {
            if (logo != null) {
                carrierDTO.setLogo(logo.toDTO(false));
            }
        }
        return carrierDTO;
    }

}

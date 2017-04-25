package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ShippingRegionDTO;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Audited
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

    @NotAudited
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "region_country", joinColumns = {@JoinColumn(name = "region_id")}, inverseJoinColumns = {@JoinColumn(name = "country_id")})
    private Set<Country> countries = new HashSet<>();

}

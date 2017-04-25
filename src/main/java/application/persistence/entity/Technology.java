package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.TechnologyDTO;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Audited
@Entity
@Data
public class Technology implements DTOConvertable<TechnologyDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    private String name;

    @Override
    public TechnologyDTO toDTO(boolean selectAsParent, Object... parentParams) {
        TechnologyDTO technologyDTO = new TechnologyDTO();
        technologyDTO.setUid(id);
        technologyDTO.setName(name);
        return technologyDTO;
    }

}

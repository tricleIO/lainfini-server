package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.TechnologyDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Technology implements DTOConvertable<TechnologyDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

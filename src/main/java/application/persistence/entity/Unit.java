package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.UnitDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Unit implements DTOConvertable<UnitDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String abbr;

    @Override
    public UnitDTO toDTO(boolean selectAsParent) {
        UnitDTO unitDTO = new UnitDTO();
        unitDTO.setUid(id);
        unitDTO.setName(name);
        unitDTO.setAbbr(abbr);
        return unitDTO;
    }

}

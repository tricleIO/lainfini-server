package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.SizeDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Size implements DTOConvertable<SizeDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String value;

    @Override
    public SizeDTO toDTO(boolean selectAsParent, Object... parentParams) {
        SizeDTO sizeDTO = new SizeDTO();
        sizeDTO.setUid(id);
        sizeDTO.setValue(value);
        return sizeDTO;
    }

}

package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.SizeDTO;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Audited
@Data
@Entity
public class Size extends SoftDeletableEntityImpl implements SoftDeletableEntity, DTOConvertable<SizeDTO>, Serializable {

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

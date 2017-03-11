package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.FlashEnum;
import application.rest.domain.FlashDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Flash implements DTOConvertable<FlashDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private FlashEnum type;

    private String title;

    private String message;

    @Override
    public FlashDTO toDTO(boolean selectAsParent, Object... parentParams) {
        FlashDTO flashDTO = new FlashDTO();
        flashDTO.setUid(id);
        flashDTO.setType(type);
        flashDTO.setTitle(title);
        flashDTO.setMessage(message);
        return flashDTO;
    }

}

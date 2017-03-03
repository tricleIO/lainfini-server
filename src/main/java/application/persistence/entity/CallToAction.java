package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.CallEnum;
import application.rest.domain.CallDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CallToAction implements DTOConvertable<CallDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private CallEnum type;

}

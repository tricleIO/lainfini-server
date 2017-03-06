package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.MaterialDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Material implements DTOConvertable<MaterialDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Override
    public MaterialDTO toDTO() {
        MaterialDTO materialDTO = new MaterialDTO();
        materialDTO.setUid(id);
        materialDTO.setName(name);
        return materialDTO;
    }

}

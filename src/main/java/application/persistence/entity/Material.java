package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.MaterialDTO;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Audited
@Data
@Entity
public class Material extends SoftDeletableEntityImpl implements DTOConvertable<MaterialDTO>, SoftDeletableEntity, SlugEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String composition;

    private String slug;

    @Override
    public MaterialDTO toDTO(boolean selectAsParent, Object... parentParams) {
        MaterialDTO materialDTO = new MaterialDTO();
        materialDTO.setUid(id);
        materialDTO.setName(name);
        materialDTO.setComposition(composition);
        materialDTO.setSlug(slug);
        return materialDTO;
    }

}

package application.rest.domain;

import application.persistence.entity.Material;
import application.persistence.type.StatusEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaterialDTO implements ReadWriteDatabaseDTO<Material>, IdentifableDTO<Integer>, SoftDeletableDTO, SlugDTO {

    private Integer uid;
    private String name;
    private String composition;
    private String slug;
    private StatusEnum status;

    @Override
    public Material toEntity(boolean selectAsParent, Object... parentParams) {
        Material material = new Material();
        material.setId(uid);
        material.setName(name);
        material.setComposition(composition);
        material.setSlug(slug);
        material.setStatus(status);
        return material;
    }

    @Override
    public String slugFrom() {
        return name;
    }
}

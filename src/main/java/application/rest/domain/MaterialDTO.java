package application.rest.domain;

import application.persistence.entity.Material;
import lombok.Data;

@Data
public class MaterialDTO implements ReadWriteDatabaseDTO<Material>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private String composition;
    private String urlSlug;

    @Override
    public Material toEntity(boolean selectAsParent, Object... parentParams) {
        Material material = new Material();
        material.setId(uid);
        material.setName(name);
        material.setComposition(composition);
        material.setUrlSlug(urlSlug);
        return material;
    }

}

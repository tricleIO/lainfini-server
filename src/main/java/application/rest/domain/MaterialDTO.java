package application.rest.domain;

import application.persistence.entity.Material;
import lombok.Data;

@Data
public class MaterialDTO implements ReadWriteDatabaseDTO<Material>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;

    @Override
    public Material toEntity() {
        Material material = new Material();
        material.setId(uid);
        material.setName(name);
        return material;
    }

}

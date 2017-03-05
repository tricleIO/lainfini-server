package application.rest.domain;

import application.persistence.entity.Material;
import lombok.Data;

@Data
public class MaterialDTO implements ReadWriteDatabaseDTO<Material> {

    private Integer uid;
    private String name;

    @Override
    public Material toEntity() {
        Material material = new Material();
        material.setName(name);
        return material;
    }

}

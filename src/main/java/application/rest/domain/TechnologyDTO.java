package application.rest.domain;

import application.persistence.entity.Technology;
import lombok.Data;

@Data
public class TechnologyDTO implements ReadWriteDatabaseDTO<Technology>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;

    @Override
    public Technology toEntity(boolean selectAsParent, Object... parentParams) {
        Technology technology = new Technology();
        technology.setId(uid);
        technology.setName(name);
        return technology;
    }

}

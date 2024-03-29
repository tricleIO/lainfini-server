package application.rest.domain;

import application.persistence.entity.Technology;
import application.persistence.type.StatusEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechnologyDTO implements ReadWriteDatabaseDTO<Technology>, IdentifableDTO<Integer>, SoftDeletableDTO {

    private Integer uid;
    private String name;
    private StatusEnum status;

    @Override
    public Technology toEntity(boolean selectAsParent, Object... parentParams) {
        Technology technology = new Technology();
        technology.setId(uid);
        technology.setName(name);
        technology.setStatus(status);
        return technology;
    }

}

package application.rest.domain;

import application.persistence.entity.Unit;
import application.persistence.type.StatusEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnitDTO implements ReadWriteDatabaseDTO<Unit>, IdentifableDTO<Integer>, SoftDeletableDTO {

    private Integer uid;
    private String name;
    private String abbr;
    private StatusEnum status;

    @Override
    public Unit toEntity(boolean selectAsParent, Object... parentParams) {
        Unit unit = new Unit();
        unit.setId(uid);
        unit.setName(name);
        unit.setAbbr(abbr);
        unit.setStatus(status);
        return unit;
    }

}

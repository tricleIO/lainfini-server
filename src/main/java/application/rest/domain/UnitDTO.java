package application.rest.domain;

import application.persistence.entity.Unit;
import lombok.Data;

@Data
public class UnitDTO implements ReadWriteDatabaseDTO<Unit>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private String abbr;

    @Override
    public Unit toEntity(boolean selectAsParent, Object... parentParams) {
        Unit unit = new Unit();
        unit.setId(uid);
        unit.setName(name);
        unit.setAbbr(abbr);
        return unit;
    }

}

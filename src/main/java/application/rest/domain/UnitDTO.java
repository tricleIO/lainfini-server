package application.rest.domain;

import application.persistence.entity.Unit;
import lombok.Data;

@Data
public class UnitDTO implements ReadWriteDatabaseDTO<Unit> {

    private Integer uid;
    private String name;
    private String abbr;

    @Override
    public Unit toEntity() {
        Unit unit = new Unit();
        unit.setId(uid);
        unit.setName(name);
        unit.setAbbr(abbr);
        return unit;
    }

}

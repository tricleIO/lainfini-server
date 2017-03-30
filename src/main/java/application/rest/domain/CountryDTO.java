package application.rest.domain;

import application.persistence.entity.Country;
import lombok.Data;

@Data
public class CountryDTO implements ReadWriteDatabaseDTO<Country> {

    private Integer uid;
    private String name;
    private String code;
    private Integer regionUid;

    @Override
    public Country toEntity(boolean selectAsParent, Object... parentParams) {
        Country country = new Country();
        country.setId(uid);
        country.setName(name);
        country.setCode(code);
        return country;
    }

}

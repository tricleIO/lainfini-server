package application.rest.domain;

import application.persistence.entity.Country;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryDTO implements ReadWriteDatabaseDTO<Country>, IdentifableDTO<Integer> {

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

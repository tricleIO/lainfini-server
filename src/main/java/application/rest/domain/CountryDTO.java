package application.rest.domain;

import application.persistence.entity.Country;
import application.persistence.type.StatusEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryDTO implements ReadWriteDatabaseDTO<Country>, SoftDeletableDTO, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private String code;
    private Integer regionUid;
    private StatusEnum status;

    @Override
    public Country toEntity(boolean selectAsParent, Object... parentParams) {
        Country country = new Country();
        country.setId(uid);
        country.setName(name);
        country.setCode(code);
        country.setStatus(status);
        return country;
    }

}

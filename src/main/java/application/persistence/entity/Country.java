package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.CountryDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Country extends SoftDeletableEntityImpl implements DTOConvertable<CountryDTO>, SoftDeletableEntity, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    private String code;

    @Override
    public CountryDTO toDTO(boolean selectAsParent, Object... parentParams) {
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setUid(id);
        countryDTO.setName(name);
        countryDTO.setCode(code);
        return countryDTO;
    }

}

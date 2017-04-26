package application.service.country;

import application.persistence.entity.Country;
import application.rest.domain.CountryDTO;
import application.service.BaseDatabaseService;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CountryService extends BaseDatabaseService<Country, Integer, CountryDTO> {

    ServiceResponse<Page<CountryDTO>> readAll(Pageable pageable);

}

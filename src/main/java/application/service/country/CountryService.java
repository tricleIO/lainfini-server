package application.service.country;

import application.rest.domain.CountryDTO;
import application.service.response.ServiceResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CountryService {

    ServiceResponse<Page<CountryDTO>> readAll(Pageable pageable);

}

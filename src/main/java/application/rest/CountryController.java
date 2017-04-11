package application.rest;

import application.persistence.entity.Country;
import application.rest.domain.CountryDTO;
import application.service.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shipping/countries")
public class CountryController extends AbstractDatabaseController<Country, Integer, CountryDTO, CountryService> {

    @Autowired
    private CountryService countryService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCountries(@RequestParam(required = false, defaultValue = "false") Boolean excludePagination, Pageable pageable) {
        if (excludePagination) {
            pageable = new PageRequest(pageable.getPageNumber(), Integer.MAX_VALUE, pageable.getSort());
        }
        return getPageResponseEntity(
                countryService.readAll(pageable)
        );
    }

    @Override
    public CountryService getBaseService() {
        return countryService;
    }

}
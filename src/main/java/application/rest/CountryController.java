package application.rest;

import application.rest.domain.CountryDTO;
import application.service.country.CountryService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCountries(Pageable pageable) {
        ServiceResponse<Page<CountryDTO>> countriesResponse = countryService.readAll(pageable);
        if (!countriesResponse.isSuccessful()) {
            return new ErrorResponseEntity(countriesResponse.getStatus());
        }
        return new ResponseEntity<>(countriesResponse.getBody(), HttpStatus.OK);
    }

}
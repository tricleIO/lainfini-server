package application.rest;

import application.persistence.entity.ShippingRegion;
import application.rest.domain.CountryDTO;
import application.rest.domain.ShippingRegionDTO;
import application.service.response.ServiceResponse;
import application.service.shippingRegion.ShippingRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shipping/regions")
public class ShippingRegionController extends AbstractDatabaseController<ShippingRegion, Integer, ShippingRegionDTO, ShippingRegionService> {

    @Autowired
    private ShippingRegionService shippingRegionService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readMaterials(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readMaterial(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(value = "/{id}/countries", method = RequestMethod.POST)
    public ResponseEntity<?> addCountry(@PathVariable Integer id, @RequestBody CountryDTO country) {
        country.setRegionUid(id);
        ServiceResponse<CountryDTO> countryResponse = shippingRegionService.addCountry(country);
        if (!countryResponse.isSuccessful()) {
            return new ErrorResponseEntity(countryResponse.getStatus());
        }
        return new ResponseEntity<>(countryResponse.getBody(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/countries", method = RequestMethod.GET)
    public ResponseEntity<?> readCountries(@PathVariable Integer id) {
        ServiceResponse<Page<CountryDTO>> countryResponse = shippingRegionService.readCountries(id);
        if (!countryResponse.isSuccessful()) {
            return new ErrorResponseEntity(countryResponse.getStatus());
        }
        return new ResponseEntity<>(countryResponse.getBody(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createMaterial(@RequestBody ShippingRegionDTO shippingRegionDTO) {
        return create(shippingRegionDTO);
    }

    @Override
    public ShippingRegionService getBaseService() {
        return shippingRegionService;
    }

}
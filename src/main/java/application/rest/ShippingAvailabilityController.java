package application.rest;

import application.persistence.entity.ShippingAvailability;
import application.rest.domain.ShippingAvailabilityDTO;
import application.service.shippingAvailability.ShippingAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shipping/availabilities")
public class ShippingAvailabilityController extends AbstractDatabaseController<ShippingAvailability, Integer, ShippingAvailabilityDTO, ShippingAvailabilityService> {

    @Autowired
    private ShippingAvailabilityService shippingAvailabilityService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readMaterials(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readMaterial(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createMaterial(@RequestBody ShippingAvailabilityDTO ShippingAvailabilityDTO) {
        return create(ShippingAvailabilityDTO);
    }

    @Override
    public ShippingAvailabilityService getBaseService() {
        return shippingAvailabilityService;
    }

}
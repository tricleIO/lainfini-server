package application.rest;

import application.persistence.entity.Carrier;
import application.rest.domain.CarrierDTO;
import application.service.carrier.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "shipping/carriers")
public class CarrierController extends AbstractDatabaseController<Carrier, Integer, CarrierDTO, CarrierService> {

    @Autowired
    private CarrierService carrierService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCarriers(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCarrier(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCarrier(@RequestBody CarrierDTO carrierDTO) {
        return create(carrierDTO);
    }

    @Override
    public CarrierService getBaseService() {
        return carrierService;
    }

}
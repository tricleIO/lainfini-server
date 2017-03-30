package application.rest;

import application.persistence.entity.ShippingTariff;
import application.rest.domain.ShippingTariffDTO;
import application.service.shippingTariff.ShippingTariffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shippingTariffs")
public class ShippingTariffController extends AbstractDatabaseController<ShippingTariff, Integer, ShippingTariffDTO, ShippingTariffService> {

    @Autowired
    private ShippingTariffService shippingTariffService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readMaterials(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readMaterial(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createMaterial(@RequestBody ShippingTariffDTO ShippingTariffDTO) {
        return create(ShippingTariffDTO);
    }

    @Override
    public ShippingTariffService getBaseService() {
        return shippingTariffService;
    }

}
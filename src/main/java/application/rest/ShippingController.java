package application.rest;

import application.persistence.entity.Delivery;
import application.rest.domain.ShippingDTO;
import application.service.delivery.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shipping")
public class ShippingController extends AbstractDatabaseController<Delivery, Long, ShippingDTO, DeliveryService> {

    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readMaterials(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readMaterial(@PathVariable Long id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createMaterial(@RequestBody ShippingDTO shippingDTO) {
        return create(shippingDTO);
    }

    @Override
    public DeliveryService getBaseService() {
        return deliveryService;
    }

}
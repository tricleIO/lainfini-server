package application.rest;

import application.persistence.entity.ShippingRegion;
import application.rest.domain.ShippingRegionDTO;
import application.service.shippingRegion.ShippingRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shippingRegions")
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

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createMaterial(@RequestBody ShippingRegionDTO shippingRegionDTO) {
        return create(shippingRegionDTO);
    }

    @Override
    public ShippingRegionService getBaseService() {
        return shippingRegionService;
    }

}
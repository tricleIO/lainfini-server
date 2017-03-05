package application.rest;

import application.persistence.entity.Unit;
import application.rest.domain.UnitDTO;
import application.service.unit.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/units")
public class UnitController extends AbstractDatabaseController<Unit, Integer, UnitDTO, UnitService> {

    @Autowired
    private UnitService unitService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readUnits(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readUnit(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createUnit(@RequestBody UnitDTO unitDTO) {
        return create(unitDTO);
    }

    @Override
    public UnitService getBaseService() {
        return unitService;
    }

}
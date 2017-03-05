package application.rest;

import application.persistence.entity.Size;
import application.rest.domain.SizeDTO;
import application.service.size.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sizes")
public class SizeController extends AbstractDatabaseController<Size, Integer, SizeDTO, SizeService> {

    @Autowired
    private SizeService sizeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readSizes(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readSize(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createSize(@RequestBody SizeDTO sizeDTO) {
        return create(sizeDTO);
    }

    @Override
    public SizeService getBaseService() {
        return sizeService;
    }

}
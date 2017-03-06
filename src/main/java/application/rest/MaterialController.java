package application.rest;

import application.persistence.entity.Material;
import application.rest.domain.MaterialDTO;
import application.service.material.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/materials")
public class MaterialController extends AbstractDatabaseController<Material, Integer, MaterialDTO, MaterialService> {

    @Autowired
    private MaterialService materialService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readMaterials(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readMaterial(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createMaterial(@RequestBody MaterialDTO materialDTO) {
        return create(materialDTO);
    }

    @Override
    public MaterialService getBaseService() {
        return materialService;
    }

}
package application.rest;

import application.persistence.entity.CallToAction;
import application.rest.domain.CallDTO;
import application.rest.domain.SoldItemsCallDTO;
import application.service.soldItemsCall.CallToActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/calls")
public class CallToActionController extends AbstractDatabaseController<CallToAction, Integer, CallDTO, CallToActionService> {

    @Autowired
    private CallToActionService soldItemsCallService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readAddresses(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readAddress(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(value = "/soldItems", method = RequestMethod.POST)
    public ResponseEntity<?> createSoldItems(@RequestBody SoldItemsCallDTO soldItemsCallDTO) {
        return create(soldItemsCallDTO);
    }

    @Override
    public CallToActionService getBaseService() {
        return soldItemsCallService;
    }

}
package application.rest;

import application.service.abra.AbraStorecardService;
import application.service.abra.client.model.Storecard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pfilip on 27.3.17.
 */
@RestController
@RequestMapping(value = "/abra")
public class AbraController {

    @Autowired
    private AbraStorecardService abraStorecardService;

    @RequestMapping(value = "/storecards", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Storecard> getStorecards() {
        List<Storecard> storecardList = abraStorecardService.getStorecardList();
        return storecardList;
    }

    @RequestMapping(value = "storecards/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Storecard getStorecard(@PathVariable String id) {
        Storecard storecard = abraStorecardService.getStorecard(id);
        return storecard;
    }

    @RequestMapping(value = "storecards", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Storecard createStorecard(@RequestBody Storecard storecard) {
        Storecard storecardOutput = abraStorecardService.createStorecard(storecard);
        return storecardOutput;
    }

    @RequestMapping(value = "storecards/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Storecard updateStorecard(@PathVariable String id, @RequestBody Storecard storecard) {
        Storecard storecardOutput = abraStorecardService.updateStorecard(id, storecard);
        return storecardOutput;
    }

    @RequestMapping(value = "storecards/{id}", method = RequestMethod.DELETE)
    public Boolean deleteStorecard(@PathVariable String id) {
        boolean isSuccessful = abraStorecardService.deleteStorecard(id);
        return isSuccessful;
    }
}

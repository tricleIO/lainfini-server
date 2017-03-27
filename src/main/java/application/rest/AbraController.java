package application.rest;

import application.service.abra.AbraService;
import application.service.abra.client.model.Storecard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pfilip on 27.3.17.
 */
@RestController
@RequestMapping(value = "/abra")
public class AbraController {

    @Autowired
    private AbraService abraService;

    @RequestMapping(value = "storecards",method = RequestMethod.GET)
    public void getStorecards() {
        List<Storecard> storecardList = abraService.getStorecardList();
    }
}

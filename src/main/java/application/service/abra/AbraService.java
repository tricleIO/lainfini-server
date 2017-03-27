package application.service.abra;

import application.service.abra.client.model.Storecard;

import java.util.List;

/**
 * Created by pfilip on 27.3.17.
 */
public interface AbraService {

//    GET
///storecards
//    Získá kolekci BO Skladová karta
        List<Storecard> getStorecardList();

//            POST
///storecards
//    Vytvoří nový BO Skladová karta

    Storecard createStorecard(Storecard storecard);
//            GET
///storecards/{id}
//    Získá konkrétní BO Skladová karta

    Storecard getStorecard(String id);
//            PUT
///storecards/{id}
//    Provede aktualizaci BO Skladová karta

    Storecard updateStorecard(String id);
//            DELETE
///storecards/{id}
//    Smaže BO Skladová karta

    boolean deleteStorecard(String id);
}

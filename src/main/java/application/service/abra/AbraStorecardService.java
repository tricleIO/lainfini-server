package application.service.abra;

import application.persistence.entity.Product;
import application.service.abra.client.model.Storecard;

import java.util.List;

/**
 * Created by pfilip on 29.3.17.
 */
public interface AbraStorecardService {


    List<Product> syncStorecardsWithProducts();

    //            GET
    ///storecards
    //    Získá kolekci BO Skladová karta
    List<Storecard> getStorecardList();

    //            GET
    ///storecards/{id}
    //    Získá konkrétní BO Skladová karta
    Storecard getStorecard(String id);

    //            POST
    ///storecards
    //    Vytvoří nový BO Skladová karta
    Storecard createStorecard(Storecard storecard);

    //            PUT
    ///storecards/{id}
    //    Provede aktualizaci BO Skladová karta
    Storecard updateStorecard(String id, Storecard storecard);

    //            DELETE
    ///storecards/{id}
    //    Smaže BO Skladová karta
    boolean deleteStorecard(String id);
}

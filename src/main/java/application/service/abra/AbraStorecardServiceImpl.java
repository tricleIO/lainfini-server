package application.service.abra;

import application.persistence.entity.Product;
import application.persistence.repository.ProductRepository;
import application.service.abra.client.model.Storecard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pfilip on 29.3.17.
 */
@Service
public class AbraStorecardServiceImpl extends AbraServiceImpl<Storecard>  implements AbraStorecardService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> syncStorecardsWithProducts() {
//        for (Storecard storecard : getStorecardList()) {
//            Product product = productRepository.findByCode(storecard.getCode());
//            if (product != null) {
//                product.setEan(storecard.getEan());
//                product.setName(storecard.getName());
//                product.setPrice(storecard.ge);
////                product.setProductStatus();
////                product.setStatus();
////                product.setShortDescription();
////                product.setCategory();
//                product.setMainImage();
//                product.setMaterial();
//                product.setSize();
//                product.setUnit();
//            }
//        }
        return null;
    }

    @Override
    public List<Storecard> getStorecardList() {
        String url = URL + "storecards";
        Object o = requestAbra(url, HttpMethod.GET, Storecard.class, true);
        return (List<Storecard>) o;
    }

    @Override
    public Storecard createStorecard(Storecard storecard) {
        String url = URL + "storecards";
        Object o = requestAbra(url, HttpMethod.POST, storecard, Storecard.class, false);
        return (Storecard) o;
    }

    @Override
    public Storecard getStorecard(String id) {
        String url = URL + "storecards/"+id;
        Object o = requestAbra(url, HttpMethod.GET, Storecard.class, false);
        return (Storecard) o;
    }

    @Override
    public Storecard updateStorecard(String id, Storecard storecard) {
        String url = URL + "storecards/"+id;
        Object o = requestAbra(url, HttpMethod.PUT,storecard, Storecard.class, false);
        return (Storecard) o;
    }

    @Override
    public boolean deleteStorecard(String id) {
        String url = URL + "storecards/"+id;
        Object o = requestAbra(url, HttpMethod.GET, Boolean.class, false);
        return (boolean) o;

    }
}

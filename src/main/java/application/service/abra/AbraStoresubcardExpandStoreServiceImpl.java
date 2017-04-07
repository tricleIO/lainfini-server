package application.service.abra;

import application.rest.domain.ProductAvailabilityDTO;
import application.rest.domain.ProductDTO;
import application.service.abra.client.custom.StoresubcardExpandStore;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.response.ServiceResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by pfilip on 6.4.17.
 */
@Service
public class AbraStoresubcardExpandStoreServiceImpl extends AbraServiceImpl<StoresubcardExpandStore> implements AbraStoresubcardExpandStoreService {

    @Autowired
    private ProductService productService;

    /**
     * Check product availability by system UUID
     * @param uuid
     * @return
     */
    public ServiceResponse<ProductAvailabilityDTO> checkProductAvailability(UUID uuid) {
        ServiceResponse<ProductDTO> productDTOServiceResponse = productService.read(uuid);
        ProductDTO productDTO = productDTOServiceResponse.getBody();
        String abraLink = productDTO.getAbraLink();

        Object o = requestAbra(URL + "StoreSubCards?Select=storecard_id,quantity&where=StoreCard_ID+eq+'"+abraLink+"'&expand=store_id", HttpMethod.GET, StoresubcardExpandStore.class, true);
        List<StoresubcardExpandStore> storesubcard = (List<StoresubcardExpandStore>) o;
        ProductAvailabilityDTO.AvailabilityStatusEnum availability= ProductAvailabilityDTO.AvailabilityStatusEnum.SOLD;
        if (storesubcard != null && storesubcard.size() > 0) {
            ProductAvailabilityDTO productAvailabilityDTO = new ProductAvailabilityDTO();
            productAvailabilityDTO.setProductUid(uuid);
            List<ProductAvailabilityDTO.Stock> stocks = new ArrayList<>();
            for (StoresubcardExpandStore storesubcardExpandStore : storesubcard) {
                if (storesubcardExpandStore.getQuantity() > 0) {
                    availability = ProductAvailabilityDTO.AvailabilityStatusEnum.IN_STOCK;
                }
                ProductAvailabilityDTO.Stock stock = new ProductAvailabilityDTO.Stock();
                stock.setQuantity(storesubcardExpandStore.getQuantity());
                stock.setId(storesubcardExpandStore.getStore().getId());
                stock.setLocation(storesubcardExpandStore.getStore().getName());
                stocks.add(stock);
            }
            productAvailabilityDTO.setStocks(stocks);
            productAvailabilityDTO.setStatus(availability);
            return ServiceResponse.success(productAvailabilityDTO);
        }
        return ServiceResponse.error(ServiceResponseStatus.NOT_FOUND);
    }
}

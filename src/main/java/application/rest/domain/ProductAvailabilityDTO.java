package application.rest.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Created by pfilip on 6.4.17.
 */
@Data
public class ProductAvailabilityDTO implements Serializable {

    private UUID productUid;

    private List<Stock> stocks;

    private AvailabilityStatusEnum status;

    public enum AvailabilityStatusEnum {
        IN_STOCK,
        SOLD,
        NOT_AVAILABLE
    }


    @Data
    public static class Stock {

        private String id;

        private String location;

        private Integer quantity;

    }


//    {
//        "productUid": "67cdd801-a2a5-4ba6-8343-61f02928338c",
//            "stocks": [
//        {
//            "id": 23,
//                "location": "Prague",
//                "amount": "15"
//        },
//        {
//            "id": 24,
//                "location": "eshop",
//                "amount": "2"
//        }
//            ],
//        "status": "IN_STOCK"
//    }
}

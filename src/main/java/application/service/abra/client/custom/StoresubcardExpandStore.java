package application.service.abra.client.custom;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by pfilip on 6.4.17.
 */
@Data
public class StoresubcardExpandStore {

    @SerializedName(value = "storecard_id")
    private String storecardId;

    @SerializedName(value = "quantity")
    private Integer quantity;

    @SerializedName(value = "store_id")
    private StoreName store;

    @Data
    public class StoreName {

        @SerializedName(value = "id")
        private String id;

        @SerializedName(value = "name")
        private String name = null;
    }

}

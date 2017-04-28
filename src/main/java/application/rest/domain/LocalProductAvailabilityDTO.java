package application.rest.domain;

import application.persistence.type.ProductStatusEnum;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class LocalProductAvailabilityDTO {

    private UUID productUid;
    private List<StockProductQuantityDTO> stocks;
    private ProductStatusEnum status;

}

package application.rest.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class UnstockItemsDTO {

    private UUID productUid;
    private int amount = 1;
    private UUID orderUid;
//    private List<String> serialNumbers;

}

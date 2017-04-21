package application.rest.domain;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class UnstockItemsDTO {

    private UUID productUid;
    private int amount = 1;
    private List<String> serialNumbers;

}

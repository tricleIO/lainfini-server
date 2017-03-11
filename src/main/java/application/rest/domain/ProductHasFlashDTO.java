package application.rest.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class ProductHasFlashDTO {

    private UUID productUid;
    private Integer flashUid;

}

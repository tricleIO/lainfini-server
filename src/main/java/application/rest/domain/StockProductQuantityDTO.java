package application.rest.domain;

import lombok.Data;

@Data
public class StockProductQuantityDTO {

    private Integer uid;
    private String location;
    private Long quantity;

}

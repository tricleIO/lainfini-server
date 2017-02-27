package application.rest.domain;

import lombok.Data;

@Data
public class CartHasProductDTO {

    private Long cartId;
    private Long productId;
    private Integer number = 1;

}

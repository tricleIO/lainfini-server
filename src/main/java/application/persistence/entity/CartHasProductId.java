package application.persistence.entity;

import javax.persistence.OneToOne;
import java.io.Serializable;

public class CartHasProductId implements Serializable {

    @OneToOne
    private Cart cart;

    @OneToOne
    private Product product;

}

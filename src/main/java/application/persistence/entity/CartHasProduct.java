package application.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@IdClass(CartHasProductId.class)
public class CartHasProduct implements Serializable {

    @Id
    @OneToOne
    private Cart cart;

    @Id
    @OneToOne
    private Product product;

    private Integer number;

}

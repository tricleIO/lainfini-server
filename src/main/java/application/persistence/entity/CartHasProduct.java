package application.persistence.entity;

import application.rest.domain.ItemDTO;
import application.rest.domain.ItemResponseDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
public class CartHasProduct implements DTOConvertable<ItemDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @NotNull
    private Cart cart;

    @OneToOne
    @NotNull
    private Product product;

    private Integer number;

    @Override
    public ItemDTO toDTO() {
        ItemResponseDTO item = new ItemResponseDTO();
        item.setProductUid(product.getId());
        item.setNumber(number);
        item.setCartUid(cart.getId());
        return item;
    }

}

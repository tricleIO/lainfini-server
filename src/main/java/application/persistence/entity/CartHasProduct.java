package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ItemDTO;
import application.rest.domain.ItemResponseDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "cart_has_product")
@Data
public class CartHasProduct implements DTOConvertable<ItemDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    private Cart cart;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @NotNull
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Override
    public ItemDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ItemResponseDTO item = new ItemResponseDTO();
        item.setProductUid(product.getId());
        item.setQuantity(quantity);
        item.setCartUid(cart.getId());
        return item;
    }

}

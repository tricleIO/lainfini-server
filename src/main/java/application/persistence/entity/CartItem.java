package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.CartItemDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartItem implements DTOConvertable<CartItemDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    private Integer quantity;

    @NotNull
    @Column(name = "added_at", nullable = false)
    private Date addedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    @Override
    public CartItemDTO toDTO(boolean selectAsParent, Object... parentParams) {
        CartItemDTO orderItemDTO = new CartItemDTO();
        orderItemDTO.setUid(id);
        if (product != null) {
            orderItemDTO.setProductUid(product.getId());
        }
        orderItemDTO.setQuantity(quantity);
        orderItemDTO.setAddedAt(addedAt);
        return orderItemDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartItem that = (CartItem) o;

        if (!product.getId().equals(that.product.getId())) return false;
        return cart.getId().equals(that.cart.getId());
    }

    @Override
    public int hashCode() {
        int result = product.getId().hashCode();
        result = 31 * result + cart.getId().hashCode();
        return result;
    }

}

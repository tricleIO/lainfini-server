package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.WishDTO;
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
public class Wish implements DTOConvertable<WishDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @NotNull
    @Column(name = "added_at", nullable = false)
    private Date addedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User customer;

    @Override
    public WishDTO toDTO(boolean selectAsParent, Object... parentParams) {
        WishDTO wishDTO = new WishDTO();
        wishDTO.setUid(id);
        if (product != null) {
            wishDTO.setProductUid(product.getId());
        }
        wishDTO.setAddedAt(addedAt);
        return wishDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wish that = (Wish) o;

        if (!product.getId().equals(that.product.getId())) return false;
        return customer.getId().equals(that.customer.getId());
    }

    @Override
    public int hashCode() {
        int result = product.getId().hashCode();
        result = 31 * result + customer.getId().hashCode();
        return result;
    }


}

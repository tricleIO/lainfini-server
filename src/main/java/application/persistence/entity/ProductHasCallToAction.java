package application.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "product_has_call_to_action")
@Data
public class ProductHasCallToAction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "call_to_action_id", referencedColumnName = "id")
    private CallToAction callToAction;

//    @Override
//    public ItemDTO toDTO() {
//        ItemResponseDTO item = new ItemResponseDTO();
//        item.setProductUid(product.getId());
//        item.setQuantity(quantity);
//        item.setCartUid(product.getId());
//        return item;
//    }

}

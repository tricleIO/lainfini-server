package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ProductCollectionItemDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductCollectionItem implements DTOConvertable<ProductCollectionItemDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    private Integer position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_collection_id", nullable = false)
    private ProductCollection productCollection;

    @Override
    public ProductCollectionItemDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ProductCollectionItemDTO productCollectionItemDTO = new ProductCollectionItemDTO();
        productCollectionItemDTO.setUid(id);
        productCollectionItemDTO.setPosition(position);
        productCollectionItemDTO.setProductUid(product.getId());
        return productCollectionItemDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductCollectionItem that = (ProductCollectionItem) o;

        if (!product.getId().equals(that.product.getId())) return false;
        return productCollection.getId().equals(that.productCollection.getId());
    }

    @Override
    public int hashCode() {
        int result = product.getId().hashCode();
        result = 31 * result + productCollection.getId().hashCode();
        return result;
    }

}

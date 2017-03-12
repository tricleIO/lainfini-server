package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ProductCollectionItemDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
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
}

package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ProductCollectionDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_collection")
@Data
public class ProductCollection implements DTOConvertable<ProductCollectionDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_collection_id", unique = true, nullable = false)
    private Integer id;

    private String name;

    private String urlSlug;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "productCollection")
    private Set<ProductCollectionItem> items;


    @Override
    public ProductCollectionDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ProductCollectionDTO productCollectionDTO = new ProductCollectionDTO();

        productCollectionDTO.setUid(id);
        productCollectionDTO.setName(name);
        productCollectionDTO.setUrlSlug(urlSlug);
        if (items != null) {
            for (ProductCollectionItem item : items) {
                productCollectionDTO.addItem(item.toDTO(false));
            }
        }
        
        return productCollectionDTO;
    }
}

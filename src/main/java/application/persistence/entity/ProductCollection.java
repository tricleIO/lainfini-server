package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ProductCollectionDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "product_collection")
@Data
public class ProductCollection extends SoftDeletableEntityImpl implements DTOConvertable<ProductCollectionDTO>, SoftDeletableEntity, SlugEntity, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "slug", unique = true)
    private String slug;

    @OneToMany(cascade=CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "productCollection")
    private Set<ProductCollectionItem> items;


    @Override
    public ProductCollectionDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ProductCollectionDTO productCollectionDTO = new ProductCollectionDTO();

        productCollectionDTO.setUid(id);
        productCollectionDTO.setName(name);
        productCollectionDTO.setSlug(slug);
        if (items != null) {
            for (ProductCollectionItem item : items) {
                productCollectionDTO.addItem(item.toDTO(false));
            }
        }
        
        return productCollectionDTO;
    }
}

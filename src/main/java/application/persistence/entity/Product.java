package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ProductDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
@Data
@EqualsAndHashCode(exclude="applicationFiles")
public class Product extends SoftDeletableEntityImpl implements DTOConvertable<ProductDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "ean", length = 13)
    private String ean;

    @Column(name = "short_description", length = 255)
    private String shortDescription;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "price")
    private Double price;

    @OneToOne
    private Category category;

    @ManyToOne
    @JoinColumn(name = "material_id", referencedColumnName = "id")
    private Material material;

    @ManyToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id")
    private Size size;

    @ManyToOne
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private Unit unit;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pf.product", cascade=CascadeType.ALL)
    private Set<ProductFile> applicationFiles = new HashSet<>();

    private String urlSlug;

    @Override
    public ProductDTO toDTO(boolean selectAsParent) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setUid(id);
        productDTO.setName(name);
        productDTO.setEan(ean);
        productDTO.setShortDescription(shortDescription);
        productDTO.setDescription(description);
        productDTO.setPrice(price);
        if (category != null) {
            productDTO.setCategoryUid(category.getId());
        }
        if (material != null) {
            productDTO.setMaterial(material.toDTO(false));
        }
        if (size != null) {
            productDTO.setSize(size.toDTO(false));
        }
        if (unit != null) {
            productDTO.setUnit(unit.toDTO(false));
        }
        productDTO.setUrlSlug(urlSlug);
        productDTO.setStatus(status);
        return productDTO;
    }

}

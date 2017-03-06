package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ProductDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Product implements DTOConvertable<ProductDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "product_has_document", joinColumns = {@JoinColumn(name = "product_id")}, inverseJoinColumns = {@JoinColumn(name = "document_id")})
    private Set<DocumentFile> documentFiles = new HashSet<DocumentFile>();

    private String urlSlug;

    @Override
    public ProductDTO toDTO() {
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
            productDTO.setMaterial(material.toDTO());
        }
        if (size != null) {
            productDTO.setSize(size.toDTO());
        }
        if (unit != null) {
            productDTO.setUnit(unit.toDTO());
        }
        productDTO.setUrlSlug(urlSlug);
        return productDTO;
    }

}

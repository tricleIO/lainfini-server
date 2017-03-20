package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.ProductStatus;
import application.rest.domain.ApplicationFileDTO;
import application.rest.domain.ProductDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "product")
@Data
@EqualsAndHashCode(exclude={"images","mainImage"})
public class Product extends SoftDeletableEntityImpl implements DTOConvertable<ProductDTO>, Serializable {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "ean", length = 13)
    private String ean;

    @Column(name = "code", length = 25)
    private String code;

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

    @OneToOne
    @JoinColumn(name = "main_image_id", referencedColumnName = "id")
    private ApplicationFile mainImage;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pf.product", cascade=CascadeType.ALL)
    private Set<ProductFile> images = new HashSet<>();

    @Transient
    private Set<ApplicationFile> applicationFiles;

    private String urlSlug;

    @Enumerated(EnumType.ORDINAL)
    private ProductStatus productStatus;

    @Override
    public ProductDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setUid(id);
        productDTO.setName(name);
        productDTO.setEan(ean);
        productDTO.setShortDescription(shortDescription);
        productDTO.setDescription(description);
        productDTO.setPrice(price);
        productDTO.setCode(code);
        productDTO.setProductStatus(productStatus);
        if (mainImage != null) {
            productDTO.setMainImageDTO(mainImage.toDTO(false));
        }
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
        if(selectAsParent) {
            Set<ApplicationFileDTO> applicationFileDTOS = new HashSet<>(images.size());
            for (ProductFile image : images) {
                ApplicationFileDTO applicationFileDTO = image.getPf().getFile().toDTO(false);
                applicationFileDTO.setSequenceNumber(image.getSequenceNumber());
                applicationFileDTOS.add(applicationFileDTO);
            }
            productDTO.setApplicationFileDTOS(applicationFileDTOS);
        }
        productDTO.setUrlSlug(urlSlug);
        productDTO.setStatus(status);
        return productDTO;
    }

}

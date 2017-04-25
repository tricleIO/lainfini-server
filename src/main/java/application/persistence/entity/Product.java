package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.ProductStatusEnum;
import application.rest.domain.ApplicationFileDTO;
import application.rest.domain.ProductDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Audited
@Entity
@Table(name = "product")
@Data
@EqualsAndHashCode(exclude={"images","mainImage"})
public class Product extends SoftDeletableEntityImpl implements DTOConvertable<ProductDTO>, SlugEntity, Serializable {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", unique = true, nullable = false, updatable = false, columnDefinition = "BINARY(16)")
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

    @Column(name = "price", precision = 11, scale = 2)
    private BigDecimal price;

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

    @NotAudited
    @OneToOne
    @JoinColumn(name = "main_image_id", referencedColumnName = "id")
    private ApplicationFile mainImage;

    @NotAudited
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pf.product", cascade=CascadeType.ALL)
    private Set<ProductFile> images = new HashSet<>();

    @Transient
    private Set<ApplicationFile> applicationFiles;

    @Column(name = "slug", unique = true)
    private String slug;

    @Enumerated(EnumType.ORDINAL)
    private ProductStatusEnum productStatus;

    @Column(name = "abra_link")
    private String abraLink;

    @ManyToOne
    @JoinColumn(name = "technology_id", referencedColumnName = "id")
    private Technology technology;

    @ManyToOne
    @JoinColumn(name = "design_id", referencedColumnName = "id")
    private ProductDesign design;

    @Column(nullable = false, columnDefinition = "TINYINT", length = 1)
    private Boolean serialNumberIsRequired;

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
        productDTO.setAbraLink(abraLink);
        productDTO.setProductStatus(productStatus);
        productDTO.setSerialNumberIsRequired(serialNumberIsRequired);
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
        if (technology != null) {
            productDTO.setTechnology(technology.toDTO(false));
        }
        if (design != null) {
            productDTO.setDesign(design.toDTO(false));
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
        productDTO.setSlug(slug);
        productDTO.setStatus(status);
        return productDTO;
    }

}

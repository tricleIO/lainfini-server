package application.rest.domain;

import application.persistence.entity.Product;
import application.persistence.entity.ProductFile;
import application.persistence.type.ProductStatusEnum;
import application.persistence.type.ShowProductEnum;
import application.persistence.type.StatusEnum;
import application.rest.CategoryController;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Product>, IdentifableDTO<UUID>, SoftDeletableDTO, SlugDTO {

    private UUID uid;
    private String name;
    private String ean;
    private String shortDescription;
    private String description;
    private BigDecimal price;
    private Integer categoryUid;
    private CallDTO call;
    private List<FlashDTO> flashes;
    private Boolean isFavourite = false;
    private MaterialDTO material;
    private Integer materialUid;
    private SizeDTO size;
    private Integer sizeUid;
    private UnitDTO unit;
    private Integer unitUid;
    private String slug;
    private StatusEnum status;
    private String code;
    private ProductStatusEnum productStatus;
    private Integer technologyUid;
    private Integer designUid;
    private Boolean serialNumberIsRequired;

    private Long productStock;
    private ProductStatusEnum productAvailability;
    private ShowProductEnum show;

    private String abraLink;

    @JsonProperty("mainImage")
    private ApplicationFileDTO mainImageDTO;

    @JsonProperty("images")
    private Set<ApplicationFileDTO> applicationFileDTOS;

    private CategoryDTO category;
    private TechnologyDTO technology;
    private ProductDesignDTO design;

    @Override
    public Product toEntity(boolean selectAsParent, Object... parentParams) {
        Product product = new Product();
        product.setId(uid);
        product.setName(name);
        product.setEan(ean);
        product.setShortDescription(shortDescription);
        product.setDescription(description);
        product.setPrice(price);
        product.setCode(code);
        product.setAbraLink(abraLink);
//        product.setProductStatus(productStatus);
        product.setSerialNumberIsRequired(serialNumberIsRequired);
        product.setShowProduct(show);
        if (mainImageDTO != null) {
            product.setMainImage(mainImageDTO.toEntity(false));
        }
        if (selectAsParent) {
            if (category != null) {
                product.setCategory(category.toEntity(false));
            }
            if (material != null) {
                product.setMaterial(material.toEntity(false));
            }
            if (size != null) {
                product.setSize(size.toEntity(false));
            }
            if (unit != null) {
                product.setUnit(unit.toEntity(false));
            }
            if (applicationFileDTOS != null) {
                for (ApplicationFileDTO applicationFileDTO : applicationFileDTOS) {
                    ProductFile productFile = new ProductFile();
                    productFile.getPf().setFile(applicationFileDTO.toEntity(false));
                    productFile.getPf().setProduct(product);
                    product.getImages().add(productFile);
                }
            }
            if (technology != null) {
                product.setTechnology(technology.toEntity(false));
            }
            if (design != null) {
                product.setDesign(design.toEntity(false));
            }
        }
        product.setSlug(slug);
        product.setStatus(status);
        return product;
    }

    @Override
    public void addLinks() {
        if (categoryUid != null) {
            add(linkTo(methodOn(CategoryController.class).readCategory(categoryUid)).withRel("category"));
        }
    }

    @Override
    public String slugFrom() {
        return name;
    }
    
}

package application.rest.domain;

import application.persistence.entity.Product;
import application.persistence.entity.ProductFile;
import application.persistence.type.StatusEnum;
import application.rest.CategoryController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Product>, IdentifableDTO<UUID>, SoftDeletableDTO {

    private UUID uid;
    private String name;
    private String ean;
    private String shortDescription;
    private String description;
    private Double price;
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
    private String urlSlug;
    private StatusEnum status;
    private Set<ApplicationFileDTO> applicationFileDTOS;

    private CategoryDTO category;

    @Override
    public Product toEntity(boolean selectAsParent, Object... parentParams) {
        Product product = new Product();
        product.setId(uid);
        product.setName(name);
        product.setEan(ean);
        product.setShortDescription(shortDescription);
        product.setDescription(description);
        product.setPrice(price);
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


        if (selectAsParent) {
            HashSet<ProductFile> productFiles = new HashSet<>();

            for (ApplicationFileDTO applicationFileDTO : applicationFileDTOS) {
                ProductFile productFile = new ProductFile();
                productFile.getPf().setFile(applicationFileDTO.toEntity(false));
                productFile.getPf().setProduct(product);
                product.getImages().add(productFile);
            }
        }


        product.setUrlSlug(urlSlug);
        product.setStatus(status);
        return product;
    }

    @Override
    public void addLinks() {
        if (categoryUid != null) {
            add(linkTo(methodOn(CategoryController.class).readCategory(categoryUid)).withRel("category"));
        }
    }

}

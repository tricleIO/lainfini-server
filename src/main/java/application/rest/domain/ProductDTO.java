package application.rest.domain;

import application.persistence.entity.Product;
import application.rest.CategoryController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Product> {

    private Long uid;
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

    @Override
    public Product toEntity() {
        Product product = new Product();
        product.setId(uid);
        product.setName(name);
        product.setEan(ean);
        product.setShortDescription(shortDescription);
        product.setDescription(description);
        product.setPrice(price);
        if (material != null) {
            product.setMaterial(material.toEntity());
        }
        return product;
    }

    @Override
    public void addLinks() {
        if (categoryUid != null) {
            add(linkTo(methodOn(CategoryController.class).readCategory(categoryUid)).withRel("category"));
        }
    }

}

package application.rest.domain;

import application.persistence.entity.ProductCollection;
import application.persistence.type.StatusEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductCollectionDTO implements ReadWriteDatabaseDTO<ProductCollection>, IdentifableDTO<Integer>, SoftDeletableDTO, SlugDTO {

    private Integer uid;
    private String name;
    private String slug;
    private List<ProductCollectionItemDTO> items = new LinkedList<>();
    private StatusEnum status;

    @Override
    public ProductCollection toEntity(boolean selectAsParent, Object... parentParams) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.setId(uid);
        productCollection.setName(name);
        productCollection.setSlug(slug);
        productCollection.setStatus(status);
        return productCollection;
    }

    public void addItem(ProductCollectionItemDTO item) {
        items.add(item);
    }

    @Override
    public String slugFrom() {
        return name;
    }

}

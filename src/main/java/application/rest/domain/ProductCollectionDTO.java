package application.rest.domain;

import application.persistence.entity.ProductCollection;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class ProductCollectionDTO implements ReadWriteDatabaseDTO<ProductCollection>, IdentifableDTO<Integer>, SlugDTO {

    private Integer uid;
    private String name;
    private String slug;
    private List<ProductCollectionItemDTO> items = new LinkedList<>();

    @Override
    public ProductCollection toEntity(boolean selectAsParent, Object... parentParams) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.setId(uid);
        productCollection.setName(name);
        productCollection.setSlug(slug);
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

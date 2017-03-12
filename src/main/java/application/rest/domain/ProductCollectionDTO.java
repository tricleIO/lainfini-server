package application.rest.domain;

import application.persistence.entity.ProductCollection;
import lombok.Data;

import java.util.Set;

@Data
public class ProductCollectionDTO implements ReadWriteDatabaseDTO<ProductCollection>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private String urlSlug;
    private Set<ProductCollectionItemDTO> items;

    @Override
    public ProductCollection toEntity(boolean selectAsParent, Object... parentParams) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.setId(uid);
        productCollection.setName(name);
        productCollection.setUrlSlug(urlSlug);
        return productCollection;
    }

    public void addItem(ProductCollectionItemDTO item) {
        items.add(item);
    }

}

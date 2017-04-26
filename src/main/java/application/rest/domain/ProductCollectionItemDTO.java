package application.rest.domain;


import application.persistence.entity.ProductCollectionItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductCollectionItemDTO implements ReadWriteDatabaseDTO<ProductCollectionItem>, IdentifableDTO<Integer> {

    private Integer uid;
    private UUID productUid;
    private Integer position;
    private Integer collectionUid;

    private ProductDTO product;
    private ProductCollectionDTO collection;

    @Override
    public ProductCollectionItem toEntity(boolean selectAsParent, Object... parentParams) {
        ProductCollectionItem productCollectionItem = new ProductCollectionItem();
        productCollectionItem.setId(uid);
        productCollectionItem.setPosition(position);
        if (selectAsParent) {
            if (product != null) {
                productCollectionItem.setProduct(product.toEntity(false));
            }
            if (collection != null) {
                productCollectionItem.setProductCollection(collection.toEntity(false));
            }
        }
        return productCollectionItem;
    }

}

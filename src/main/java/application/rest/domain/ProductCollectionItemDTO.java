package application.rest.domain;


import application.persistence.entity.ProductCollectionItem;
import lombok.Data;

import java.util.UUID;

@Data
public class ProductCollectionItemDTO implements ReadWriteDatabaseDTO<ProductCollectionItem> {

    private Integer uid;
    private UUID productUid;
    private Integer position;

    @Override
    public ProductCollectionItem toEntity(boolean selectAsParent, Object... parentParams) {
        ProductCollectionItem productCollectionItem = new ProductCollectionItem();
        productCollectionItem.setId(uid);
        productCollectionItem.setPosition(position);
        return productCollectionItem;
    }

}

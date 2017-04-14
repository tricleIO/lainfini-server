package application.rest.domain;

import application.persistence.entity.ProductDesign;
import lombok.Data;

@Data
public class ProductDesignDTO implements ReadWriteDatabaseDTO<ProductDesign>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;

    @Override
    public ProductDesign toEntity(boolean selectAsParent, Object... parentParams) {
        ProductDesign productDesign = new ProductDesign();
        productDesign.setId(uid);
        productDesign.setName(name);
        return productDesign;
    }

}

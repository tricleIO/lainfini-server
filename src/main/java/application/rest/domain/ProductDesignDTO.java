package application.rest.domain;

import application.persistence.entity.ProductDesign;
import application.persistence.type.StatusEnum;
import lombok.Data;

@Data
public class ProductDesignDTO implements ReadWriteDatabaseDTO<ProductDesign>, IdentifableDTO<Integer>, SoftDeletableDTO {

    private Integer uid;
    private String name;
    private StatusEnum status;

    @Override
    public ProductDesign toEntity(boolean selectAsParent, Object... parentParams) {
        ProductDesign productDesign = new ProductDesign();
        productDesign.setId(uid);
        productDesign.setName(name);
        productDesign.setStatus(status);
        return productDesign;
    }

}

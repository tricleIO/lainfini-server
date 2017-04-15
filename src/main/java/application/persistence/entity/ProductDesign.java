package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ProductDesignDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class ProductDesign implements DTOConvertable<ProductDesignDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Override
    public ProductDesignDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ProductDesignDTO productDesignDTO = new ProductDesignDTO();
        productDesignDTO.setUid(id);
        productDesignDTO.setName(name);
        return productDesignDTO;
    }

}

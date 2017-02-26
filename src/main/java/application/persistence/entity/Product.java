package application.persistence.entity;

import application.rest.domain.EntityConvertable;
import application.rest.domain.ProductDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Product implements DTOConvertable<ProductDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Integer price;

    @Override
    public ProductDTO toDTO() {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setUid(id);
        productDTO.setName(name);
        productDTO.setDescription(description);
        productDTO.setPrice(price);
        return  productDTO;
    }

}

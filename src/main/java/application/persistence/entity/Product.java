package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ProductDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Product implements DTOConvertable<ProductDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "price")
    private Double price;

    @OneToOne
    private Category category;

    @Override
    public ProductDTO toDTO() {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setUid(id);
        productDTO.setName(name);
        productDTO.setDescription(description);
        productDTO.setPrice(price);
        if (category != null) {
            productDTO.setCategoryUid(category.getId());
        }
        return  productDTO;
    }

}
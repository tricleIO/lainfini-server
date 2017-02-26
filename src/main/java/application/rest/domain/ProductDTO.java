package application.rest.domain;

import application.persistence.entity.Product;
import lombok.Data;

@Data
public class ProductDTO implements ReadWriteDatabaseDTO<Product> {

    private Long id;
    private String name;
    private String description;
    private Integer price;

    @Override
    public Product toEntity() {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        return product;
    }

}

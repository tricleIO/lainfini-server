package application.service.product;

import application.persistence.entity.Product;
import application.rest.domain.ProductDTO;
import application.service.DatabaseServiceInterface;

public interface ProductService extends DatabaseServiceInterface<Product, Long, ProductDTO> {

}

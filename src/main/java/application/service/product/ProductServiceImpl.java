package application.service.product;

import application.persistence.entity.Product;
import application.persistence.repository.ProductRepository;
import application.rest.domain.ProductDTO;
import application.service.AbstractDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends AbstractDatabaseService<Product, Long, ProductRepository, ProductDTO> implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductRepository getRepository() {
        return productRepository;
    }

}

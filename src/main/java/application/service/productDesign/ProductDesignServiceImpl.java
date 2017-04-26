package application.service.productDesign;

import application.persistence.entity.ProductDesign;
import application.persistence.repository.ProductDesignRepository;
import application.rest.domain.ProductDesignDTO;
import application.service.BaseDatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDesignServiceImpl extends BaseDatabaseServiceImpl<ProductDesign, Integer, ProductDesignRepository, ProductDesignDTO> implements ProductDesignService {

    @Autowired
    private ProductDesignRepository productDesignRepository;

    @Override
    public ProductDesignRepository getRepository() {
        return productDesignRepository;
    }

}

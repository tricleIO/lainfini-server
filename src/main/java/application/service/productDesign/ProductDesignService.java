package application.service.productDesign;

import application.persistence.entity.ProductDesign;
import application.rest.domain.ProductDesignDTO;
import application.service.BaseSoftDeletableDatabaseService;

public interface ProductDesignService extends BaseSoftDeletableDatabaseService<ProductDesign, Integer, ProductDesignDTO> {

}

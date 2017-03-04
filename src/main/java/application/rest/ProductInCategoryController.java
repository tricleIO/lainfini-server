package application.rest;

import application.persistence.entity.Product;
import application.rest.domain.ProductDTO;
import application.rest.domain.UserDTO;
import application.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = "/categories")
public class ProductInCategoryController extends AbstractDatabaseController<Product, Long, ProductDTO, ProductService> {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{categoryId}/products", method = RequestMethod.GET)
    public ResponseEntity<?> readProducts(@PathVariable Integer categoryId, Pageable pageable, Principal principal) {
        UserDTO userDTO = null;
        if (principal != null) {
            System.out.println(principal);
            System.out.println(principal.getName());
        }
        return getPageResponseEntity(
                productService.readProductsInCategoryAndSubcategories(categoryId, pageable, principal)
        );
    }

    @Override
    public ProductService getBaseService() {
        return productService;
    }

}
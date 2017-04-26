package application.rest;

import application.persistence.entity.ProductCollection;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.ProductCollectionDTO;
import application.service.productCollection.ProductCollectionService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products/collections")
public class ProductCollectionController extends AbstractDatabaseController<ProductCollection, Integer, ProductCollectionDTO, ProductCollectionService> {

    @Autowired
    private ProductCollectionService productCollectionService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCollection(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCollections(Pageable pageable, @RequestParam(name = "slug", required = false) String slug) {
        if (slug != null) {
            return getSimpleResponseEntity(
                    productCollectionService.readBySlug(slug)
            );
        }
        return getPageResponseEntity(
                productCollectionService.readAll(pageable)
        );
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCollection(@RequestBody ProductCollectionDTO productCollection) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(productCollection);
    }

    @Override
    public ProductCollectionService getBaseService() {
        return productCollectionService;
    }

}
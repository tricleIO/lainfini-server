package application.rest;

import application.persistence.entity.ProductCollectionItem;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.ProductCollectionItemDTO;
import application.service.productCollectionItem.ProductCollectionItemService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products/collections")
public class ProductCollectionItemController extends AbstractDatabaseController<ProductCollectionItem, Integer, ProductCollectionItemDTO, ProductCollectionItemService> {

    @Autowired
    private ProductCollectionItemService productCollectionItemService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{collectionId}/items", method = RequestMethod.POST)
    public ResponseEntity<?> createCollectionItem(@PathVariable Integer collectionId, @RequestBody ProductCollectionItemDTO productCollectionItem) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        productCollectionItem.setCollectionUid(collectionId);
        return create(productCollectionItem);
    }

    @Override
    public ProductCollectionItemService getBaseService() {
        return productCollectionItemService;
    }

}
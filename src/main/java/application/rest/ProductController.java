package application.rest;

import application.persistence.entity.Product;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.ProductAvailabilityDTO;
import application.rest.domain.ProductDTO;
import application.rest.domain.ProductHasFlashDTO;
import application.service.abra.AbraStoresubcardExpandStoreService;
import application.service.product.ProductService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.UUID;

@RestController
@RequestMapping(value = "/products")
public class ProductController extends AbstractDatabaseController<Product, UUID, ProductDTO, ProductService> {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @Autowired
    private AbraStoresubcardExpandStoreService abraStoresubcardExpandStoreService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readProducts(Pageable pageable, @RequestParam(name = "slug", required = false) String slug, Principal principal) {
        if (slug != null) {
            return getSimpleResponseEntity(
                    productService.readBySlug(slug)
            );
        }
        return getPageResponseEntity(
                productService.readAll(pageable, principal)
        );
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readProduct(@PathVariable UUID id, Principal principal) {
        return getSimpleResponseEntity(
                productService.read(id, principal)
        );
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createProduct(@RequestBody ProductDTO product) {
        // has logged user demanded roles
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // error
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProduct(@PathVariable UUID id) {
        // has logged user demanded roles
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // error
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return getSimpleResponseEntity(
                productService.delete(id)
        );
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> patchProduct(@PathVariable UUID id, @RequestBody ProductDTO productDTO) {
        // has logged user demanded roles
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // error
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        productDTO.setUid(id);
        return getSimpleResponseEntity(
                productService.patch(productDTO)
        );
    }

    @RequestMapping(value = "/{productId}/flashes", method = RequestMethod.POST)
    public ResponseEntity<?> addFlash(@PathVariable UUID productId, @RequestBody ProductHasFlashDTO productHasFlash) {
        // has logged user demanded roles
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        // error
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        productHasFlash.setProductUid(productId);
        return getSimpleResponseEntity(
                productService.addFlash(productHasFlash)
        );
    }

    @RequestMapping(value = "/image/{imageId}", method = RequestMethod.GET)
    public ResponseEntity<?> readProductsByImage(@PathVariable Long imageId) {
        return getPageResponseEntity(
                productService.findByImagesPfFileId(imageId)
        );
    }

    @RequestMapping(value = "product/{id}/availability", method = RequestMethod.GET)
    public ProductAvailabilityDTO checkAvailability(@PathVariable UUID id) {
        ServiceResponse<ProductAvailabilityDTO> productAvailabilityDTOServiceResponse = abraStoresubcardExpandStoreService.checkProductAvailability(id);
        return productAvailabilityDTOServiceResponse.getBody();
    }

    @Override
    public ProductService getBaseService() {
        return productService;
    }

}
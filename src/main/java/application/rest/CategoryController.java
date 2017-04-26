package application.rest;

import application.persistence.entity.Category;
import application.persistence.type.UserRoleEnum;
import application.rest.domain.CategoryDTO;
import application.service.category.CategoryService;
import application.service.response.ServiceResponse;
import application.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController extends AbstractDatabaseController<Category, Integer, CategoryDTO, CategoryService> {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readMainCategories(Pageable pageable) {
        return getPageResponseEntity(
                categoryService.readMainCategories(pageable)
        );
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCategory(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(value = "/{id}/categories", method = RequestMethod.GET)
    public ResponseEntity<?> readSubcategories(@PathVariable Integer id, Pageable pageable) {
        return getPageResponseEntity(
                categoryService.readSubcategories(id, pageable)
        );
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCategory(@RequestBody CategoryDTO category) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return create(category);
    }

    @RequestMapping(value = "/{id}/categories", method = RequestMethod.POST)
    public ResponseEntity<?> createSubcategory(@PathVariable Integer id, @RequestBody CategoryDTO category) {
        ServiceResponse<Boolean> hasRolesResponse = userService.hasCurrentUserDemandedRoles(
                UserRoleEnum.ROLE_ADMIN
        );
        if (!hasRolesResponse.isSuccessful()) {
            return new ErrorResponseEntity(hasRolesResponse.getStatus());
        }
        return getSimpleResponseEntity(
                categoryService.createSubcategory(id, category)
        );
    }

    @Override
    public CategoryService getBaseService() {
        return categoryService;
    }

}
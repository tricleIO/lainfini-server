package application.rest;

import application.persistence.entity.Category;
import application.rest.domain.CategoryDTO;
import application.service.category.CategoryService;
import application.service.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController extends AbstractDatabaseController<Category, Integer, CategoryDTO, CategoryService> {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readCategories(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "/{id}/categories", method = RequestMethod.GET)
    public ResponseEntity<?> readSubcategories(@PathVariable Integer id, Pageable pageable) {
        return getPageResponseEntity(categoryService.readSubcategories(id, pageable));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> readCategory(@PathVariable Integer id) {
        return read(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createCategory(@RequestBody CategoryDTO category) {
        return create(category);
    }

    @RequestMapping(value = "/{id}/categories", method = RequestMethod.POST)
    public ResponseEntity<?> createSubcategory(@PathVariable Integer id, @RequestBody CategoryDTO category) {
        ServiceResponse<CategoryDTO> response = categoryService.createSubcategory(id, category);
        if (response.isSuccessful()) {
            CategoryDTO responseCategoryDTO = response.getBody();
            responseCategoryDTO.addLinks();
            return ResponseEntity.ok(responseCategoryDTO);
        }
        return new ErrorResponseEntity(response.getStatus());
    }

    @Override
    public CategoryService getBaseService() {
        return categoryService;
    }

}
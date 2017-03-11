package application.rest.domain;

import application.persistence.entity.Category;
import application.rest.CategoryController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDTO extends ResourceSupport implements ReadWriteDatabaseDTO<Category>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;
    private Integer parentCategoryUid;

    // for create
    private CategoryDTO parentCategory;

    @Override
    public Category toEntity(boolean selectAsParent, Object... parentParams) {
        Category category = new Category();
        category.setId(uid);
        category.setName(name);
        if (parentCategory != null) {
            category.setParent(parentCategory.toEntity(false));
        }
        return category;
    }

    @Override
    public void addLinks() {
        if (parentCategoryUid != null) {
            add(linkTo(methodOn(CategoryController.class).readCategory(parentCategoryUid)).withRel("parentCategory"));
        }
    }

}

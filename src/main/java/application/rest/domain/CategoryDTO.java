package application.rest.domain;

import application.persistence.entity.Category;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDTO implements ReadWriteDatabaseDTO<Category> {

    private Integer uid;
    private String name;
    private Integer parentCategoryUid;

    // for create
    private CategoryDTO parentCategory;

    @Override
    public Category toEntity() {
        Category category = new Category();
        category.setId(uid);
        category.setName(name);
        if (parentCategory != null) {
            category.setParent(parentCategory.toEntity());
        }
        return category;
    }

}

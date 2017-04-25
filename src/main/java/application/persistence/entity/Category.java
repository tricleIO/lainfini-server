package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.CategoryDTO;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Audited
@Data
@Entity
@Table(name = "category")
public class Category implements DTOConvertable<CategoryDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 60)
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_category_id", referencedColumnName = "id", nullable = true)
    private Category parentCategory;

    @Column(name = "priority")
    private Integer priority;

    @Override
    public CategoryDTO toDTO(boolean selectAsParent, Object... parentParams) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setUid(id);
        categoryDTO.setName(name);
        if (parentCategory != null) {
            categoryDTO.setParentCategoryUid(parentCategory.getId());
        }
        return categoryDTO;
    }

}

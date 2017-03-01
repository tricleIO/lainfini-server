package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.CategoryDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

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
    private Category parent;

    @Override
    public CategoryDTO toDTO() {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setUid(id);
        categoryDTO.setName(name);
        if (parent != null) {
            categoryDTO.setParentCategoryUid(parent.getId());
        }
        return categoryDTO;
    }

}

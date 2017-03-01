package application.service.category;

import application.persistence.entity.Category;
import application.rest.domain.CategoryDTO;
import application.service.DatabaseServiceInterface;

public interface CategoryService extends DatabaseServiceInterface<Category, Integer, CategoryDTO> {

}

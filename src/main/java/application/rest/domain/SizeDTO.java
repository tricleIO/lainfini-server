package application.rest.domain;

import application.persistence.entity.Size;
import lombok.Data;

@Data
public class SizeDTO implements ReadWriteDatabaseDTO<Size>, IdentifableDTO<Integer> {

    private Integer uid;
    private String name;

    @Override
    public Size toEntity(boolean selectAsParent, Object... parentParams) {
        Size size = new Size();
        size.setId(uid);
        size.setName(name);
        return size;
    }

}
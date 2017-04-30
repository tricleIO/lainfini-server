package application.rest.domain;

import application.persistence.entity.Size;
import application.persistence.type.StatusEnum;
import lombok.Data;

@Data
public class SizeDTO implements ReadWriteDatabaseDTO<Size>, IdentifableDTO<Integer>, SoftDeletableDTO {

    private Integer uid;
    private String value;
    private StatusEnum status;

    @Override
    public Size toEntity(boolean selectAsParent, Object... parentParams) {
        Size size = new Size();
        size.setId(uid);
        size.setValue(value);
        size.setStatus(status);
        return size;
    }

}

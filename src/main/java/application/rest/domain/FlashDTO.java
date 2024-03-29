package application.rest.domain;

import application.persistence.entity.Flash;
import application.persistence.type.FlashEnum;
import lombok.Data;

@Data
public class FlashDTO implements ReadWriteDatabaseDTO<Flash>, IdentifableDTO<Integer> {

    private Integer uid;
    private FlashEnum type;
    private String title;
    private String message;

    @Override
    public Flash toEntity(boolean selectAsParent, Object... parentParams) {
        Flash flash = new Flash();
        flash.setId(uid);
        flash.setType(type);
        flash.setTitle(title);
        flash.setMessage(message);
        return flash;
    }

}

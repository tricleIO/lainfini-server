package application.rest.domain;

import application.persistence.entity.AbstractFile;
import application.persistence.entity.ImageFile;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageFileDTO implements ReadWriteDatabaseDTO<ImageFile>, IdentifableDTO<Long>, Serializable {

    private AbstractFileDTO abstractFileDTO;

    private Integer width;

    private Integer height;

    @Override
    public ImageFile toEntity(boolean selectAsParent, Object... parentParams) {
        ImageFile imageFile = new ImageFile();
        if (abstractFileDTO != null) {
            imageFile.setFile((AbstractFile) parentParams[0]);
        }
        imageFile.setHeight(height);
        imageFile.setWidth(width);
        return imageFile;
    }

    @Override
    public Long getUid() {
        return abstractFileDTO.getUid();
    }

    @Override
    public void setUid(Long key) {
        abstractFileDTO.setUid(key);
    }

}

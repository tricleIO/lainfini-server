package application.rest.domain;

import application.persistence.entity.PhotoFile;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PhotoFileDTO extends AbstractFileDTO<PhotoFile> {

    private Integer width;

    private Integer height;

    @Override
    public PhotoFile toEntity() { //todo, bude záležet, co budeme vracet
        PhotoFile photoFile = new PhotoFile();
        photoFile.setFileName(fileName);
        photoFile.setIndex(fileIndex);
        photoFile.setFileDescription(fileDescription);
        photoFile.setFileStatus(fileStatus);
        photoFile.setHeight(height);
        photoFile.setWidth(width);
        return photoFile;
    }

    @Override
    public void addLinks() {

    }
}

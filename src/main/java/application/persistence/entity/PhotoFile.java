package application.persistence.entity;

import application.rest.domain.PhotoFileDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pfilip on 2.3.17.
 */
@Entity
@Data
@Table(name = "photo_file")
public class PhotoFile extends AbstractFile<PhotoFileDTO> {

    private Integer width;

    private Integer height;


    @Override
    public PhotoFileDTO toDTO() {
        PhotoFileDTO photoFileDTO = new PhotoFileDTO();
        photoFileDTO.setUid(getId());
        photoFileDTO.setFileIndex(getIndex());
        photoFileDTO.setFileName(getFileName());
        photoFileDTO.setFileDescription(getFileDescription());
        photoFileDTO.setFileStatus(getFileStatus());
        photoFileDTO.setHeight(getHeight());
        photoFileDTO.setWidth(getWidth());
        return photoFileDTO;
    }
}

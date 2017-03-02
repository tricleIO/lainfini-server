package application.persistence.entity;

import application.rest.domain.PhotoFileDTO;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pfilip on 2.3.17.
 */
@Entity
@Table(name = "photo_file")
public class PhotoFile extends AbstractFile<PhotoFileDTO> {

    private Integer width;

    private Integer height;


    @Override
    public PhotoFileDTO toDTO() {
        return null;
    }
}

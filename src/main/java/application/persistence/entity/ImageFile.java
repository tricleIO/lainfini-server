package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ImageFileDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pfilip on 2.3.17.
 */
@Entity
@Data
@Table(name = "image_file")
public class ImageFile implements DTOConvertable<ImageFileDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "file_id",referencedColumnName = "id")
    private AbstractFile file;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Override
    public ImageFileDTO toDTO() {
        ImageFileDTO imageFileDTO = new ImageFileDTO();
        imageFileDTO.setHeight(getHeight());
        imageFileDTO.setWidth(getWidth());
        return imageFileDTO;
    }
}

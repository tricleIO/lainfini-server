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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "file_id",referencedColumnName = "id")
    private AbstractFile file;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Override
    public ImageFileDTO toDTO(boolean selectAsParent, Object... parentParams) {
        ImageFileDTO imageFileDTO = new ImageFileDTO();
        if (parentParams!= null && parentParams[0] != null)
        {
//         imageFileDTO.setAbstractFileDTO((AbstractFileDTO) parentParams[0]);
        } else if (selectAsParent) {
            imageFileDTO.setAbstractFileDTO(file.toDTO(false));
        }
        imageFileDTO.setHeight(getHeight());
        imageFileDTO.setWidth(getWidth());
        return imageFileDTO;
    }
}

package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.FileStatusEnum;
import application.rest.domain.AbstractFileDTO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@Entity
@Table(name = "base_file")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AbstractFile<T extends AbstractFileDTO>  implements DTOConvertable<T>, Serializable {

    /**
     * Path to file is defined as /ddd/ddd/dd{id}/id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_index", columnDefinition = "BINARY(16)")
    private UUID index;

    @Column(name = "file_name", length = 255)
    private String fileName;

    @Column(name = "mime_type", length = 32)
    private String mimeType;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "file_description", length = 511)
    private String fileDescription;

    @Column(name = "file_status")
    @Enumerated(EnumType.STRING)
    private FileStatusEnum fileStatus;

    @Column(name = "valid_from", nullable = false)
    private Date validFrom = new Date();

    @Column (name = "valid_to")
    private Date validTo;

    @OneToOne(mappedBy = "file",cascade = CascadeType.ALL)
    private ImageFile imageFile;


    @Override
    public T toDTO(boolean selectAsParent) {
        T applicationFileDTO = null;
        try {
            applicationFileDTO = getDTOClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        applicationFileDTO.setUid(getId());
        applicationFileDTO.setFileIndex(getIndex());
        applicationFileDTO.setFileName(getFileName());
        applicationFileDTO.setMimeType(getMimeType());
        applicationFileDTO.setFileDescription(getFileDescription());
        applicationFileDTO.setFileStatus(getFileStatus());
        return (T) applicationFileDTO;
    }

    protected abstract Class<T> getDTOClass();

}

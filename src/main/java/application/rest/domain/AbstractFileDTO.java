package application.rest.domain;

import application.persistence.entity.AbstractFile;
import application.persistence.type.FileStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
public abstract class AbstractFileDTO<T extends AbstractFile> extends ResourceSupport implements ReadWriteDatabaseDTO<T>, Serializable {

    protected Long uid;
    protected UUID fileIndex;
    protected String mimeType;
    protected String fileName;
    protected String fileDescription;
    protected FileStatusEnum fileStatus;

    protected ImageFileDTO imageFileDTO;

    @Transient
    @JsonIgnore
    private MultipartFile file;

}

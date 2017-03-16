package application.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by pfilip on 13.3.17.
 */
@Embeddable
@Data
public class FileCollectionHasFileId  implements Serializable {

    @ManyToOne
    @JsonIgnore
    private FileCollection collection;

    @ManyToOne
    @JsonIgnore
    private ApplicationFile file;

}

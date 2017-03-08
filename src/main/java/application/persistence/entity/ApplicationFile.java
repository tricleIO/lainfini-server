package application.persistence.entity;

import application.rest.domain.ApplicationFileDTO;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * Created by pfilip on 2.3.17.
 */
@Entity
@Data
@DiscriminatorValue("F")
public class ApplicationFile extends AbstractFile<ApplicationFileDTO> {

    @ManyToMany(cascade= CascadeType.ALL, mappedBy="applicationFiles")
    private Set<Product> products;

    @Override
    public ApplicationFileDTO toDTO() { //todo dodělat
        ApplicationFileDTO applicationFileDTO = new ApplicationFileDTO();
        applicationFileDTO.setUid(getId());
        applicationFileDTO.setFileIndex(getIndex());
        applicationFileDTO.setFileName(getFileName());
        applicationFileDTO.setMimeType(getMimeType());
        applicationFileDTO.setFileDescription(getFileDescription());
        applicationFileDTO.setFileStatus(getFileStatus());
        if (getImageFile() != null) {
            applicationFileDTO.setImageFileDTO(getImageFile().toDTO());
        }
        return applicationFileDTO;
    }

    @Override
    protected Class<ApplicationFileDTO> getDTOClass() {
        return ApplicationFileDTO.class;
    }
}

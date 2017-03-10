package application.persistence.entity;

import application.rest.domain.ApplicationFileDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by pfilip on 2.3.17.
 */
@Entity
@DiscriminatorValue("F")
@Data
@EqualsAndHashCode(exclude = "productFiles")
public class ApplicationFile extends AbstractFile<ApplicationFileDTO> {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pf.file")
    private Set<ProductFile> productFiles;

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
